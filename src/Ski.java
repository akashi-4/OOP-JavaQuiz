/**
 * Classe que representa uma pergunta de Ski, um subtipo de perguntas de Desporto.
 *
 * @version 1.0
 * @author Joao Furukawa
 */
public class Ski extends Desporto {
    /**
     * Construtor para perguntas de Ski.
     *
     * @param pergunta O texto da pergunta.
     * @param resposta A resposta correta da pergunta.
     * @param opcoes   As opções de resposta da pergunta.
     */
    public Ski(String pergunta, String resposta, String[] opcoes) {
        super(pergunta, resposta, opcoes);
        setMajoracao(2);
    }
    
    /**
     * Calcula a pontuação para perguntas de Ski.
     *
     * @return A pontuação calculada.
     */
    @Override
    public int calculaPontos() {
        return (getPontos() * getMajoracao()) + 3;
    }
}
