
public class Pelicula {
	
	private int duracion;
	private int edadmin;
	private String director;
	
	/**
	 * Constructor pelicula
	 * @param pelicula
	 * @param precio
	 * @param dur
	 * @param e
	 * @param d
	 */
	public Pelicula(int dur,int e,String d) {
		duracion=dur;
		edadmin=e;
		director=d;
	}
	//GETTERS
	public int getDur() {
		return duracion;
	}
	public int getEdadmin() {
		return edadmin;
	}
	public String getDirector() {
		return director;
	}

}
