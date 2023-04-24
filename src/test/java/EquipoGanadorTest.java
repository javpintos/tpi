import entidades.Equipo;
import entidades.Partido;
import entidades.EnumResultado;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EquipoGanadorTest {
    //método que en función de un partido dice quien ganó
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEq1;
    private int golesEq2;

    @Before
    public void SetUp(){
        equipo1 = new Equipo("Argentina");
        equipo2 = new Equipo("Arabia Saudita");
    }

    @Test
    public void TestEquipo1Ganador(){
        Partido partido = new Partido(equipo1, equipo2, 2, 1);

        assertEquals(EnumResultado.GANADOR, partido.resultado(equipo1));
    }
    @Test
    public void TestEquipo2Ganador(){
        Partido partido = new Partido(equipo1, equipo2, 1, 2);

        assertEquals(EnumResultado.GANADOR, partido.resultado(equipo2));
    }
    @Test
    public void TestEmpateEntreEquipos(){
        Partido partido = new Partido(equipo1, equipo2, 1, 1);

        assertEquals(EnumResultado.EMPATE, partido.resultado(equipo1));
        assertEquals(EnumResultado.EMPATE, partido.resultado(equipo2));
    }
}