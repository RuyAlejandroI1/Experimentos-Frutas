package ExperimentosFrutas;

import Experimento.Experimento;
import ManzanosyDuraznos.Arbol;
import ManzanosyDuraznos.ArbolManzano;

public class ExperimentoManzana implements Experimento {
	private ArbolManzano[] manzanos;
	private String especie = "manzanas";

	public int getPromedioNumeroFrutas() {
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			suma = suma + manzanos[i].getNumeroFrutas();
		}
		return suma / 5;
	}

	public int getPromedioAlturaArbol() {
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			suma = suma + manzanos[i].getAlturaCm();
		}
		return suma / 5;
	}

	public int getPromedioPesoFrutas() {
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			suma = suma + manzanos[i].getPesoPromedioFruta();
		}
		return suma / 5;
	}

	public void setArboles(Arbol[] arboles) {
		this.manzanos = (ArbolManzano[]) arboles;
	}

	public String getEspecie() {
		return especie;
	}
}