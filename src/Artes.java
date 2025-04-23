/**
 * Classe que representa uma pergunta de Artes, um tipo de pergunta.
 *
 * @version 1.0
 * @author Joao Furukawa
 */
public class Artes extends Pergunta {

    /**
     * Construtor para perguntas de Artes.
     *
     * @param pergunta O texto da pergunta.
     * @param resposta A resposta correta da pergunta.
     * @param opcoes   As opções de resposta da pergunta.
     */
    public Artes(String pergunta, String resposta, String[] opcoes) {
        super(pergunta, resposta, opcoes);
        setMajoracao(10);
    }

    /**
     * Calcula a pontuação para perguntas de Artes.
     *
     * @return A pontuação calculada.
     */
    @Override
    public int calculaPontos() {
       return getPontos() * getMajoracao();
    }
}
