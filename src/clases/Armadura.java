package clases;

public class Armadura implements Artefacto {
    Integer piezasArmadura;

    public Armadura(Integer piezasArmadura) {
        this.piezasArmadura = piezasArmadura;
    }

    public Integer ObtenerNivelLucha() {
        return piezasArmadura+10;
    }
}
