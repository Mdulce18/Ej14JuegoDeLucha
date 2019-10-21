package clases;

import junit.framework.TestCase;

public class GuerreroTest extends TestCase {
    Guerrero jason= new Guerrero();
    Espada espadadorara= new Espada(3);
    public void setUp(){
        jason.agregarArtefacto(new Espada(3));
        jason.agregarArtefacto(new CollarDivino(8));
    }

    public void testArtefactosJason() {
        assertTrue(jason.getCantArtefactos()==2);
    }
    public void testNivelJason() {
        assertTrue(jason.getNivelDeLucha()==11);
    }
}