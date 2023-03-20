package ExperimentoManzanas;

import ManzanosyDuraznos.ArbolManzana;

public class VistaManzana {
	 public void run() {
	 ArbolManzana[] manzanos = new ArbolManzana[5];
	 manzanos[0] = new ArbolManzana( 1, 16, 230, 200);
	 manzanos[1] = new ArbolManzana( 2, 20, 200, 190);
	 manzanos[2] = new ArbolManzana( 3, 13, 210, 180);
	 manzanos[3] = new ArbolManzana( 4, 25, 190, 200);
	 manzanos[4] = new ArbolManzana( 5, 22, 198, 205);
	 Experimento exp = new Experimento();
	 exp.setManzanos(manzanos);
	 System.out.println("Rendimiento del cultivo de manzanas");
	 int promedioManzanas= exp.getPromedioNumeroManzanas();
	 System.out.println("Numero promedio de manzanas "+promedioManzanas);
	 int promedioAlturaArbolManzana= exp.getPromedioAlturaArbolManzana();
	 System.out.println("Altura promedio de los arboles "+promedioAlturaArbolManzana);
	 int promedioPesoManzana= exp.getPromedioPesoManzana();
	 System.out.println("Peso promedio de las manzanas"+promedioPesoManzana);
	 }
	}

