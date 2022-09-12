
public class Espectador{
	
	private double dinero;
	private int edad;
	private String nombre;
	
	/**
	 * Constructor pelicula
	 * @param pelicula
	 * @param precio
	 * @param dur
	 * @param e
	 * @param d
	 */
	public Espectador(String n,int e,double d) {
		nombre=n;
		edad=e;
		dinero=d;
	}
	//GETTERS
	public double getDinero() {
		return dinero;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}

}
