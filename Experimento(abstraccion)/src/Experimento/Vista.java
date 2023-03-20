package Experimento;

import ManzanosyDuraznos.Arbol;

public class Vista {
	 private Experimento experimento;
	 protected Arbol[] arboles;
	 public void run(){
	 experimento.setArboles(arboles);
	 System.out.println("Rendimiento del cultivo de "+experimento.getEspecie());
	 int promedio = experimento.getPromedioNumeroFrutas();
	 System.out.println("Numero promedio de "+experimento.getEspecie()+" "+promedio);
	 int promedioAlturaArbol= experimento.getPromedioAlturaArbol();
	 System.out.println("Altura promedio de los arboles "+promedioAlturaArbol);
	 int promedioPeso= experimento.getPromedioPesoFrutas();
	 System.out.println("Peso promedio de los "+experimento.getEspecie()+promedioPeso);
	 }
	 public void setArboles(Arbol[] arboles) {
	 this.arboles = arboles;
	 }
	 public void setExperimento(Experimento experimento) {
	 this.experimento = experimento;
	 }
	}
