
public class Main {

	public static void main(String[] args) {
		Sala s=new Sala("p",38.0);
		Pelicula p=new Pelicula(120,5,"Spilberg");
		Espectador[] llista;
		llista=new Espectador[10];
		Espectador e1=new Espectador("Alex",20,50);
		llista[0]=e1;
		Espectador e2=new Espectador("Elisenda",30,10);
		llista[1]=e2;
		Espectador e3=new Espectador("Marc",5,30);
		llista[2]=e3;
		Espectador e4=new Espectador("Carlota",35,500);
		llista[3]=e4;
		Espectador e5=new Espectador("Paula",20,50);
		llista[4]=e5;
		Espectador e6=new Espectador("Oriol",23,70);
		llista[5]=e6;
		Espectador e7=new Espectador("Marga",13,20);
		llista[6]=e7;
		Espectador e8=new Espectador("Pere",31,5);
		llista[7]=e8;
		Espectador e9=new Espectador("Jofre",16,15);
		llista[8]=e9;
		Espectador e10=new Espectador("Carla",40,90);
		llista[9]=e10;
		s.creacionTabla();
		for(int i=0;i<8;i++) {
			for(int j=0;j<9;j++) {
				System.out.println(s.getButacas(i, j));
			}
		}
		System.out.println("\n La posicion asignada es -> "+Asignacion(s,llista[0],p));
		
		
	}
	private static String Asignacion(Sala S, Espectador e, Pelicula p) {
		boolean dinero=false;
		boolean edad=false;
		//Comprobamos si tiene edad y dinero
		if(e.getDinero()>=S.getPrecio()) {
			dinero=true;
		}
		if(p.getEdadmin()<=e.getEdad()) {
			edad=true;
		}
		
		//generamos fila y columna aleatoriamente
		boolean trobat=false;
		int fila;
		fila=(int)Math.floor(Math.random()*(7-0+1)+0);
		int col;
		col=(int)Math.floor(Math.random()*(8-0+1)+0);
		String pos="";
		//Si tiene edad y dinero entramos en bucle
		if((dinero==true)&&(edad==true)) {
			//Comprovamos si hay sitio si no hay generamos otro hasta que encuentre sitio
			while(trobat==false) {
				String a=S.PosAsignada(fila, col);
				if(a==null) {
					fila=(int)Math.floor(Math.random()*(7-0+1)+0);
					col=(int)Math.floor(Math.random()*(8-0+1)+0);
				}
				else {
					trobat=true;
					pos=a;
				}
			}
		}
		else {
			pos="No pots veure aquesta pelicula";
		}
			return pos;
		}
		
		
		
	

}

