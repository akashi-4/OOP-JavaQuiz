import java.io.Serializable;
/**
 * Classe abstrata que representa uma pergunta genérica.
 * Subclasses definirão tipos específicos de perguntas.
 *
 * @version 1.1
 * @author Joao Furukawa and AI Assistant
 */
public abstract class Pergunta implements Serializable {
    // Membros da classe agora privados
    private String pergunta;
    private String resposta;
    private String[] opcoes = new String[4];
    private String[] opcoesEz = new String[4]; // Mantido para subtipos que o usam
    private int majoracao;
    private int pontos = 5; // Pontuação base padrão
    private String resposta2; // Relevante apenas para alguns subtipos

    /**
     * Construtor base para subclasses.
     * Inicializa os campos comuns.
     *
     * @param pergunta O texto da pergunta.
     * @param resposta A resposta correta da pergunta.
     * @param opcoes   As opções de resposta da pergunta (será clonado).
     */
    protected Pergunta(String pergunta, String resposta, String[] opcoes) {
        this.pergunta = pergunta;
        this.resposta = resposta;
        // Clone para evitar modificação externa e garantir inicialização
        this.opcoes = (opcoes != null) ? opcoes.clone() : new String[4];
        // Inicializações padrão
        this.pontos = 5;
        // Garante que outros campos opcionais tenham um estado padrão
        this.opcoesEz = new String[4];
        this.resposta2 = null;
    }

    /**
     * Construtor base para subclasses que usam opções fáceis e/ou resposta adicional.
     *
     * @param pergunta  O texto da pergunta.
     * @param resposta  A resposta correta da pergunta.
     * @param opcoes    As opções de resposta da pergunta (será clonado).
     * @param opcoesEz  As opções fáceis de resposta da pergunta (será clonado).
     * @param resposta2 A resposta adicional associada a perguntas específicas.
     */
    protected Pergunta(String pergunta, String resposta, String[] opcoes, String[] opcoesEz, String resposta2) {
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.opcoes = (opcoes != null) ? opcoes.clone() : new String[4];
        this.opcoesEz = (opcoesEz != null) ? opcoesEz.clone() : new String[4];
        this.resposta2 = resposta2;
        this.pontos = 5;
    }

     /**
     * Construtor base para subclasses que usam opções fáceis.
     *
     * @param pergunta  O texto da pergunta.
     * @param resposta  A resposta correta da pergunta.
     * @param opcoes    As opções de resposta da pergunta (será clonado).
     * @param opcoesEz  As opções fáceis de resposta da pergunta (será clonado).
     */
    protected Pergunta(String pergunta, String resposta, String[] opcoes, String[] opcoesEz) {
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.opcoes = (opcoes != null) ? opcoes.clone() : new String[4];
        this.opcoesEz = (opcoesEz != null) ? opcoesEz.clone() : new String[4];
        this.resposta2 = null; // Sem resposta2 neste construtor
        this.pontos = 5;
    }

    /**
     * Método abstrato para calcular a pontuação específica da subclasse.
     *
     * @return A pontuação calculada para esta pergunta.
     */
    public abstract int calculaPontos();

    // --- Getters ---

    public String getPergunta() {
        return this.pergunta;
    }

    public String getResposta() {
        return this.resposta;
    }

    public String[] getOpcoes() {
        // Retorna uma cópia para encapsulamento
        return (this.opcoes != null) ? this.opcoes.clone() : null;
    }

    public String[] getOpcoesEz() {
         // Retorna uma cópia para encapsulamento
        return (this.opcoesEz != null) ? this.opcoesEz.clone() : null;
    }

    // Getter para uma opção específica
    public String getUmaOpcoes(int index) {
        if (this.opcoes != null && index >= 0 && index < this.opcoes.length) {
            return this.opcoes[index];
        }
        return null;
    }

    // Getter para uma opção fácil específica
    public String getUmaOpcoesEz(int index) {
        if (this.opcoesEz != null && index >= 0 && index < this.opcoesEz.length) {
            return this.opcoesEz[index];
        }
        return null;
    }

    public int getMajoracao() {
        return this.majoracao;
    }

    public int getPontos() {
        return this.pontos;
    }

    public String getResposta2() {
        return this.resposta2;
    }

    // --- Setters ---

    protected void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    protected void setResposta(String resposta) {
        this.resposta = resposta;
    }

    // Setter para todas as opções (recebe uma cópia)
    protected void setOpcoes(String[] opcoes) {
        this.opcoes = (opcoes != null) ? opcoes.clone() : new String[4];
    }

    // Setter para uma opção específica
    protected void setOpcoes(int index, String opcao) {
         // Garante que o array exista
         if (this.opcoes == null) this.opcoes = new String[4];
         if (index >= 0 && index < this.opcoes.length) {
             this.opcoes[index] = opcao;
         }
    }

    // Setter para todas as opções fáceis (recebe uma cópia)
    protected void setOpcoesEz(String[] opcoesEz) {
        this.opcoesEz = (opcoesEz != null) ? opcoesEz.clone() : new String[4];
    }

    // Setter para uma opção fácil específica
    protected void setOpcoesEz(int index, String opcao) {
          // Garante que o array exista
          if (this.opcoesEz == null) this.opcoesEz = new String[4];
         if (index >= 0 && index < this.opcoesEz.length) {
             this.opcoesEz[index] = opcao;
         }
    }

    // Majoracao é geralmente definida pela subclasse, setter `protected`
    protected void setMajoracao(int majoracao) {
        this.majoracao = majoracao;
    }

    // Pontos base são definidos, mas pode haver necessidade de ajustar
    protected void setPontos(int pontos) {
        this.pontos = pontos;
    }

    protected void setResposta2(String resposta2) {
        this.resposta2 = resposta2;
    }
}