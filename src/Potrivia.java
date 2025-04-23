import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
/**
 * Classe principal do jogo Potrivia.
 *
 * @version 1.0
 * @author Joao Furukawa 
 */
public class Potrivia {
    /**
     * Construtor para objetos da classe Potrivia.(não utilizado neste momento)
     */
    public Potrivia() {
    }
     /**
     * Método principal que inicia o jogo Potrivia.
     *
     * @param args Os argumentos de linha de comando (não utilizados neste momento).
     */
    public static void main(String[] args) {
        iniciaOPrograma();
    }
    /**
     * Inicia o programa, lendo as perguntas do arquivo, escolhendo 5 delas e inicializando a GUI.
     */
    protected static void iniciaOPrograma(){
        ArrayList<String> shuffleOpc = new ArrayList<String>(5);
        ArrayList<Pergunta> perguntasEscolh = new ArrayList<Pergunta>(5);
        ArrayList<Pergunta> todasPerguntas = new ArrayList<Pergunta>(5);
        int index = 0;
        leFicheiro(todasPerguntas);
        escolhe5Perguntas(todasPerguntas, perguntasEscolh);
        Gui gui = new Gui(index, perguntasEscolh, shuffleOpc);
        gui.setGui(shuffleOpc);
    }
    /**
     * Gera opções embaralhadas para uma pergunta.
     *
     * @param index        O índice da pergunta.
     * @param opcoes       As opções originais da pergunta.
     * @param resposta     A resposta correta da pergunta.
     * @param shuffleArray Lista para armazenar as opções embaralhadas.
     * @param tipo         O tipo da pergunta.
     * @return A lista de opções embaralhadas.
     */
    protected static ArrayList<String> escolheOpcoes(int index,String[] opcoes,String resposta, ArrayList<String> shuffleArray, int tipo){
        if (shuffleArray.size() == 2){ //Se for de desporto de V ou F
            return shuffleArray;
        }
        for (int i = 0; i < opcoes.length; i++) { //Adiciona as opções ao array
            shuffleArray.add(opcoes[i]);
        }
        if (index < 3 && tipo == 1){ //Se for de artes e antes da 4ª pergunta tira uma alternativa
            shuffleArray.remove(shuffleArray.size()-1);
        }
        Collections.shuffle(shuffleArray); //Mistura as opções
        int random = (int) (Math.random() * shuffleArray.size()); //Escolhe uma posição aleatória
        shuffleArray.set(random, resposta); //Substitui a opção aleatória pela resposta para garantir que a resposta está entre as opcoes
        return shuffleArray;
    }
    /**
     * Escolhe aleatoriamente 5 perguntas a partir de uma lista de todas as perguntas.
     *
     * @param todasPerguntas Lista de todas as perguntas disponíveis.
     * @param perguntasEscolh Lista para armazenar as 5 perguntas escolhidas.
     */
    private static void escolhe5Perguntas(ArrayList<Pergunta> todasPerguntas, ArrayList<Pergunta> perguntasEscolh){
        ArrayList<Pergunta> arrAux = new ArrayList<>(todasPerguntas);
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * arrAux.size());
            perguntasEscolh.add(arrAux.get(random));
            arrAux.remove(random);
        }
    }
    /**
     * Lê perguntas de um arquivo e inicializa a lista de perguntas.
     *
     * @param perguntas Lista para armazenar as perguntas lidas do arquivo.
     */
    private static void leFicheiro(ArrayList<Pergunta> perguntasEscolh){
        try{
            File f = new File("perguntas.txt");
            Scanner scf = new Scanner(f);
            while (scf.hasNextLine()){
                String a = scf.nextLine();
                inicializaArray(perguntasEscolh, a);
            }
            scf.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Ficheiro não encontrado");
        }
    }
    /**
     * Inicializa a lista de perguntas com base nos dados fornecidos.
     *
     * @param perguntas Lista para armazenar as perguntas inicializadas.
     * @param a         String contendo os dados da pergunta.
     */
    private static void inicializaArray(ArrayList<Pergunta> perguntas, String a) {
        String[] input = a.split(";");
        int tipo = Integer.parseInt(input[0]);
        int subtipo = Integer.parseInt(input[1]);
        String pergunta = input[2];
        String resposta = input[3];
        
        if (tipo == 1) { // Artes
            String[] opcoes = new String[4];
            for (int i = 0; i < opcoes.length; i++) {
                opcoes[i] = input[4+i];
            }
            perguntas.add(new Artes(pergunta, resposta, opcoes));
        }
        else if (tipo == 2) { // Ciencias
            String[] opcoes = new String[4];
            String[] opcoesEz = new String[4];
            for (int i = 0; i < opcoes.length; i++) {
                opcoes[i] = input[4+i];
                opcoesEz[i] = input[8+i];
            }
            perguntas.add(new Ciencias(pergunta, resposta, opcoes, opcoesEz));
        }
        else if (tipo == 3) { // Desporto
            if (subtipo == 1) { // Futebol
                String resposta2 = input[4];
                String[] opcoes = new String[4];
                String[] opcoesEz = new String[4];
                for (int i = 0; i < opcoes.length; i++) {
                    opcoes[i] = input[5+i];
                    opcoesEz[i] = input[9+i];
                }
                perguntas.add(new Futebol(pergunta, resposta, opcoes, opcoesEz, resposta2));
            }
            else if (subtipo == 2) { // Ski
                String[] opcoes = new String[2]; // Se for V ou F
                if (input.length == 6) {
                    opcoes[0] = input[4];
                    opcoes[1] = input[5];
                } else {
                    // Se não for V ou F, lê opções normais (conforme necessário)
                    opcoes = new String[4];
                    for (int i = 0; i < opcoes.length; i++) {
                        opcoes[i] = input[4+i];
                    }
                }
                perguntas.add(new Ski(pergunta, resposta, opcoes));
            }
            else if (subtipo == 3) { // Natacao
                String[] opcoes = new String[2]; // Se for V ou F
                if (input.length == 6) {
                    opcoes[0] = input[4];
                    opcoes[1] = input[5];
                } else {
                    // Se não for V ou F, lê opções normais (conforme necessário)
                    opcoes = new String[4];
                    for (int i = 0; i < opcoes.length; i++) {
                        opcoes[i] = input[4+i];
                    }
                }
                perguntas.add(new Natacao(pergunta, resposta, opcoes));
            }
        }
    }
}
