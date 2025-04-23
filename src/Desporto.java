/**
 * Classe que representa uma pergunta do tipo Desporto.
 */
public abstract class Desporto extends Pergunta {

    /**
     * Construtor para perguntas de desporto sem opções fáceis e resposta adicional.
     * @param pergunta  A pergunta sobre desporto.
     * @param resposta  A resposta correta para a pergunta.
     * @param opcoes    As opções de resposta para a pergunta.
     */
    protected Desporto(String pergunta, String resposta, String[] opcoes) {
        super(pergunta, resposta, opcoes);
        setMajoracao(3); // Define a majoração específica para Desporto
    }

    /**
     * Construtor para perguntas de desporto com opções fáceis e resposta adicional.
     * Usado por subtipos como Futebol.
     * @param pergunta  A pergunta sobre desporto.
     * @param resposta  A resposta correta para a pergunta.
     * @param opcoes    As opções de resposta para a pergunta.
     * @param opcoesEz  As opções de resposta fáceis para a pergunta.
     * @param resposta2 A resposta adicional para a pergunta.
     */
    protected Desporto(String pergunta, String resposta, String[] opcoes, String[] opcoesEz, String resposta2) {
        super(pergunta, resposta, opcoes, opcoesEz, resposta2);
        setMajoracao(3); // Define a majoração específica para Desporto
    }
    
    /**
     * Construtor para perguntas de desporto com opções fáceis (mas sem resposta2).
     * @param pergunta  A pergunta sobre desporto.
     * @param resposta  A resposta correta para a pergunta.
     * @param opcoes    As opções de resposta para a pergunta.
     * @param opcoesEz  As opções de resposta fáceis para a pergunta.
     */
     protected Desporto(String pergunta, String resposta, String[] opcoes, String[] opcoesEz) {
        super(pergunta, resposta, opcoes, opcoesEz);
        setMajoracao(3); // Define a majoração específica para Desporto
    }

    /**
     * Calcula a pontuação base para perguntas de desporto.
     * Subclasses como Futebol podem sobrescrever isto para adicionar mais pontos.
     * @return A pontuação calculada.
     */
    @Override
    public int calculaPontos() {
        return getPontos() + getMajoracao();
    }
}
