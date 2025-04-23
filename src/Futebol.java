/**
 * Classe que representa uma pergunta de Futebol, um subtipo de perguntas de Desporto.
 *
 * @version 1.0
 * @author Joao Furukawa
 */
public class Futebol extends Desporto {

    /**
     * Construtor para perguntas de Futebol.
     *
     * @param pergunta  O texto da pergunta.
     * @param resposta  A resposta correta da pergunta.
     * @param opcoes    As opções de resposta da pergunta.
     * @param opcoesEz  As opções fáceis de resposta da pergunta.
     * @param resposta2 A resposta adicional associada a perguntas específicas.
     */
    public Futebol(String pergunta, String resposta, String[] opcoes, String[] opcoesEz, String resposta2) {
        super(pergunta, resposta, opcoes, opcoesEz, resposta2);
        setMajoracao(1);  // Define a majoração específica para Futebol
    }

    /**
     * Calcula a pontuação específica para perguntas de Futebol.
     *
     * @return A pontuação calculada.
     */
    @Override
    public int calculaPontos() {
        return getPontos() + getMajoracao() + 3;
    }
}
