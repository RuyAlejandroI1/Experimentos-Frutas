package ExperimentosFrutas;

import Experimento.Experimento;
import ManzanosyDuraznos.Arbol;
import ManzanosyDuraznos.ArbolDurazno;

public class ExperimentoDurazno implements Experimento {
	private ArbolDurazno[] duraznos;
	private String especie = "duraznos";

	public int getPromedioNumeroFrutas() {
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			suma = suma + duraznos[i].getNumeroFrutas();
		}
		return suma / 5;
	}

	public int getPromedioAlturaArbol() {
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			suma = suma + duraznos[i].getAlturaCm();
		}
		return suma / 5;
	}

	public int getPromedioPesoFrutas() {
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			suma = suma + duraznos[i].getPesoPromedioFruta();
		}
		return suma / 5;
	}

	public void setArboles(Arbol[] arboles) {
		this.duraznos = (ArbolDurazno[]) arboles;
	}

	public String getEspecie() {
		return especie;
	}
}
