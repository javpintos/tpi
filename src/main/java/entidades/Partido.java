package entidades;

public class Partido {

	private Equipo equipo1;
	private Equipo equipo2;
	private Equipo equipo3;
	private Equipo equipo4;
	private int golesEq1;
	private int golesEq2;
	private int golesEq3;
	private int golesEq4;

	public Partido(Equipo equipo1, Equipo equipo2) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public Partido(Equipo equipo1, Equipo equipo2, int golesEq1, int golesEq2) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEq1 = golesEq1;
		this.golesEq2 = golesEq2;
	}
	public Partido(Equipo equipo1, Equipo equipo2, Equipo equipo3, Equipo equipo4, int golesEq1, int golesEq2, int golesEq3, int golesEq4) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.equipo3 = equipo3;
		this.equipo4 = equipo4;
		this.golesEq1 = golesEq1;
		this.golesEq2 = golesEq2;
		this.golesEq3 = golesEq3;
		this.golesEq4 = golesEq4;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	public Equipo getEquipo3() {
		return equipo1;
	}
	public void setEquipo3(Equipo equipo1) {
		this.equipo1 = equipo3;
	}
	public Equipo getEquipo4() {
		return equipo2;
	}
	public void setEquipo4(Equipo equipo2) {
		this.equipo2 = equipo4;
	}
	public int getGolesEq1() {
		return golesEq1;
	}
	public void setGolesEq1(int golesEq1) {
		this.golesEq1 = golesEq1;
	}
	public int getGolesEq2() {
		return golesEq2;
	}
	public void setGolesEq2(int golesEq2) {
		this.golesEq2 = golesEq2;
	}
	public int getGolesEq3() {
		return golesEq1;
	}
	public void setGolesEq3(int golesEq1) {
		this.golesEq3 = golesEq3;
	}
	public int getGolesEq4() {
		return golesEq2;
	}
	public void setGolesEq4(int golesEq2) {
		this.golesEq4 = golesEq4;
	}

	public EnumResultado resultado(Equipo equipo) {
		if(golesEq1 == golesEq2) {
			return EnumResultado.EMPATE;
		}
		if(golesEq3 == golesEq4) {
			return EnumResultado.EMPATE;
		}
		if(equipo.getNombre().equals(equipo1.getNombre())) {
			if(golesEq1>golesEq2) {
				return EnumResultado.GANADOR;
			}	else {
				return EnumResultado.PERDEDOR;
			}
		} else {
			// como equipo no es equipo1, entonces es equipo2
			if(golesEq2>golesEq1) {
				return EnumResultado.GANADOR;
			}	else {
				return EnumResultado.PERDEDOR;
			}
		}
	}
}