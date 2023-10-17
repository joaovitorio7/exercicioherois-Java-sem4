package exercicioherois.model;

public class Vilao extends Personagem{
    private Integer tempoDeprisao;

    public Vilao(String nome, String superpoder, Integer tempoDeprisao) {
        this.setNome(nome);
        this.setSuperpoder(superpoder);
        this.tempoDeprisao = tempoDeprisao;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "tempoDeprisao=" + tempoDeprisao +
                '}';
    }

    public Integer getTempoDeprisao() {
        return tempoDeprisao;
    }

    public void setTempoDeprisao(Integer tempoDeprisao) {
        this.tempoDeprisao = tempoDeprisao;
    }
}
