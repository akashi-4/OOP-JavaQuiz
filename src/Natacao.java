/**
 * Classe que representa uma pergunta do tipo Natação.
 *
 * @version 1.0
 * @author Joao Furukawa
 */
public class Natacao extends Desporto {

    /**
     * Construtor para perguntas de Natação.
     *
     * @param pergunta  A pergunta sobre Natação.
     * @param resposta  A resposta correta para a pergunta.
     * @param opcoes    As opções de resposta para a pergunta.
     */
    public Natacao(String pergunta, String resposta, String[] opcoes) {
        super(pergunta, resposta, opcoes);
        setMajoracao(10);
    }

    /**
     * Calcula a pontuação total para perguntas de Natação.
     *
     * @return A pontuação total.
     */
    @Override
    public int calculaPontos() {
        return getPontos() + getMajoracao() + 3;
    }
}






