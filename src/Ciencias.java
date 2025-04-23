/**
 * Classe que representa uma pergunta de Ciências, um tipo de pergunta.
 *
 * @version 1.1
 * @author Joao Furukawa and AI Assistant
 */
public class Ciencias extends Pergunta {
    /**
     * Construtor para perguntas de Ciências.
     *
     * @param pergunta  O texto da pergunta.
     * @param resposta  A resposta correta da pergunta.
     * @param opcoes    As opções de resposta da pergunta.
     * @param opcoesEz  As opções fáceis de resposta da pergunta.
     */
    public Ciencias(String pergunta, String resposta, String[] opcoes, String[] opcoesEz) {
        super(pergunta, resposta, opcoes, opcoesEz);
        setMajoracao(5);
    }

    /**
     * Calcula a pontuação para perguntas de Ciências.
     *
     * @return A pontuação calculada.
     */
    @Override
    public int calculaPontos() {
        return getPontos() + getMajoracao();
    }
}
