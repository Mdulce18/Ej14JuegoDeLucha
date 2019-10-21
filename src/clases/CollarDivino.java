package clases;

public class CollarDivino implements Artefacto {
   Integer perlasCollar;

    public CollarDivino(Integer perlasCollar) {
        this.perlasCollar = perlasCollar;
    }

    public Integer ObtenerNivelLucha() {
        return perlasCollar;
    }
}
