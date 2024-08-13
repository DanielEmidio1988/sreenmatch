package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporada(){
        return temporada;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    public void setTemporada(int temporada){
        this.temporada = temporada;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * episodiosPorTemporada * minutosPorEpisodio;
    }
}
