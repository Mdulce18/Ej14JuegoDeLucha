package clases;

import java.util.ArrayList;
import java.util.List;

public class Guerrero {
    private List<Artefacto> artefactos = new ArrayList<>();

    public Integer getCantArtefactos() {
        return artefactos.size();
    }

    public Integer getNivelDeLucha() {
        Integer sumaNivel = 0;
        for (Artefacto unArtefacto : artefactos) {
            sumaNivel += unArtefacto.ObtenerNivelLucha();
        }
        return sumaNivel;
    }

    public void agregarArtefacto(Artefacto unArtefacto){
        artefactos.add(unArtefacto);
    }

}
