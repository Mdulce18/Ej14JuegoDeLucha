package clases;

public class Espada implements Artefacto {
    Integer unidadLucha;


    public Espada(Integer unidadLucha) {
        this.unidadLucha = unidadLucha;
    }

    public Integer ObtenerNivelLucha() {
        return unidadLucha;
    }
}
