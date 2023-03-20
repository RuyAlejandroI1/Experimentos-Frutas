package Test;

import Experimento.Vista;
import ExperimentosFrutas.ExperimentoDurazno;
import ManzanosyDuraznos.ArbolDurazno;

public class TestDurazno {
	public static void main(String[] args) {
		TestDurazno testDurazno = new TestDurazno();
		testDurazno.test();
	}

	public void test() {
		ArbolDurazno[] duraznos = new ArbolDurazno[5];
		duraznos[0] = new ArbolDurazno(1, 15, 180, 150);
		duraznos[1] = new ArbolDurazno(2, 16, 190, 160);
		duraznos[2] = new ArbolDurazno(3, 17, 200, 200);
		duraznos[3] = new ArbolDurazno(4, 16, 230, 189);
		duraznos[4] = new ArbolDurazno(5, 16, 180, 168);
		ExperimentoDurazno experimentoDurazno = new ExperimentoDurazno();
		Vista vista = new Vista();
		vista.setArboles(duraznos);
		vista.setExperimento(experimentoDurazno);
		vista.run();
	}
}
