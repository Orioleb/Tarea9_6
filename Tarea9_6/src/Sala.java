
public class Sala {
	private String butacas[][];
	private boolean libres[][];
	private String pelicula;
	private double precio;
	
	/**
	 * Metodo constructor
	 * @param pelicula
	 * @param precio
	 */
	public Sala(String pelicula, double precio) {
		butacas=new String[8][9];
		libres=new boolean[8][9];
		this.pelicula=pelicula;
		this.precio=precio;
	}
	
	//GETTERS
	public String getButacas(int pos, int p){
		return butacas[pos][p];
	}
	public String getPelicula() {
		return pelicula;
	}
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Metodo para generar los asientos de la sala y llenamos la sala con una tabla de butacas libres
	 */
	public void creacionTabla() {
	
		//Rellenamos la tabla butacas con la correcta enumeracion
		String[] letras= {"A","B","C","D","E","F","G","H","I"};
		int op;
		for(int i=0;i<9;i++) {
			op=1;
			for(int j=7;j>=0;j--) {
				butacas[j][i]=String.valueOf(op)+letras[i];
				op++;
			}
		}
		//ASientos libres
		for(int i=0;i<9;i++) {
			for(int j=0;j<8;j++) {
				libres[j][i]=false;
			}
		}
	}
	/**
	 * Vemos si la posicion esta ocupada y devolvemos el id de la posciion
	 * @param f fila generada aleatoriamente
	 * @param c columna generada aleatoriamente
	 * @return
	 */
	public String PosAsignada(int f, int c) {
		String aux;
		
		if(libres[f][c]==false) {
			libres[f][c]=true;
			aux=getButacas(f,c);
		}
		else {
			aux=null;
		}

		return aux;
	}
	

}
