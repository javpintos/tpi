import entidades.Equipo;
import entidades.Partido;
import entidades.EnumResultado;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EquipoGanadorTest {
    //método que en función de un partido dice quien ganó
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEq1;
    private int golesEq2;

    @Test
    public void VerificarEquipoGanador(){
        Equipo equipo1 = new Equipo("Argentina");
        Equipo equipo2 = new Equipo("Arabia Saudita");
        Partido partido = new Partido(equipo1, equipo2, 2, 1);

        assertEquals(EnumResultado.GANADOR, partido.resultado(equipo1));
    }
}