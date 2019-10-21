package clases;

public class MascaraOscura implements Artefacto {
    Integer nivelDeOscuridad;

    public MascaraOscura(Integer nivelDeOscuridad) {
        this.nivelDeOscuridad = nivelDeOscuridad;
    }

    public Integer ObtenerNivelLucha() {
        return nivelDeOscuridad;
    }
}
