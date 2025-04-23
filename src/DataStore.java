import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Esta classe representa um armazenamento de dados contendo informações relacionadas ao usuário,
 * incluindo nome de usuário, data e listas de perguntas corretas e incorretas.
 *
 * @version 1.0
 * @author João Furukawa
 */
public class DataStore implements Serializable {
    /**
     * O nome de usuário associado a este armazenamento de dados.
     */
    private String username;

    /**
     * A data e hora em que os dados foram armazenados.
     */
    private LocalDateTime data;

    /**
     * Lista de perguntas respondidas corretamente.
     */
    private ArrayList<Pergunta> perguntasCertas = new ArrayList<Pergunta>();

    /**
     * Lista de perguntas respondidas incorretamente.
     */
    private ArrayList<Pergunta> perguntasErradas = new ArrayList<Pergunta>();

    /**
     * Construtor padrão sem parâmetros.
     */
    public DataStore() {
        
    }
    /**
     * Construtor para armazenamento de dados.
     *
     * @param username O nome de usuário associado a este armazenamento de dados.
     * @param data     A data e hora em que os dados foram armazenados.
     * @param perguntasCertas Lista de perguntas respondidas corretamente.
     * @param perguntasErradas Lista de perguntas respondidas incorretamente.
     */
    public DataStore(String username, LocalDateTime data, ArrayList<Pergunta> perguntasCertas, ArrayList<Pergunta> perguntasErradas) {
        this.username = username;
        this.data = data;
        this.perguntasCertas = perguntasCertas;
        this.perguntasErradas = perguntasErradas;
    }

    // Getters e setters
    /**
     * Retorna o nome de usuário associado a este armazenamento de dados.
     *
     * @return O nome de usuário associado a este armazenamento de dados.
     */
    public String getUsername() {
        return this.username;
    }
    /**
     * Retorna a data e hora em que os dados foram armazenados.
     *
     * @return A data e hora em que os dados foram armazenados.
     */
    public LocalDateTime getData() {
        return this.data;
    }
    /**
     * Retorna a lista de perguntas respondidas corretamente.
     *
     * @return A lista de perguntas respondidas corretamente.
     */
    public ArrayList<Pergunta> getPerguntasCertas() {
        return this.perguntasCertas;
    }
    /**
     * Retorna a lista de perguntas respondidas incorretamente.
     *
     * @return A lista de perguntas respondidas incorretamente.
     */
    public ArrayList<Pergunta> getPerguntasErradas() {
        return this.perguntasErradas;
    }
    /**
     * Define o nome de usuário associado a este armazenamento de dados.
     *
     * @param username O nome de usuário a ser definido.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Define a data e hora em que os dados foram armazenados.
     *
     * @param data A data e hora a ser definida.
     */
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    /**
     * Define a lista de perguntas respondidas corretamente.
     *
     * @param perguntasCertas A lista de perguntas a ser definida.
     */
    public void setPerguntasCertas(ArrayList<Pergunta> perguntasCertas) {
        this.perguntasCertas = perguntasCertas;
    }
    /**
     * Define a lista de perguntas respondidas incorretamente.
     *
     * @param perguntasErradas A lista de perguntas a ser definida.
     */
    public void setPerguntasErradas(ArrayList<Pergunta> perguntasErradas) {
        this.perguntasErradas = perguntasErradas;
    }
    /**
     * Adiciona uma pergunta à lista de perguntas certas.
     *
     * @param pergunta A pergunta a ser adicionada.
     */

    public void addPerguntaCerta(Pergunta pergunta) {
        this.perguntasCertas.add(pergunta);
    }

    /**
     * Adiciona uma pergunta à lista de perguntas erradas.
     *
     * @param pergunta A pergunta a ser adicionada.
     */
    public void addPerguntaErrada(Pergunta pergunta) {
        this.perguntasErradas.add(pergunta);
    }
}

