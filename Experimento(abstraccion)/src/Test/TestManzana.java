package Test;

import Experimento.Vista;
import ExperimentosFrutas.ExperimentoManzana;
import ManzanosyDuraznos.ArbolManzano;

public class TestManzana {
	 public static void main(String[] args) {
	 TestManzana test = new TestManzana();
	 test.test();
	 }
	 public void test() {
	 ArbolManzano[] manzanos = new ArbolManzano[5];
	 manzanos[0] = new ArbolManzano( 1,16,230,200);
	 manzanos[1] = new ArbolManzano( 2,20,200,190);
	 manzanos[2] = new ArbolManzano( 3,13,210,180);
	 manzanos[3] = new ArbolManzano( 4,25,190,200);
	 manzanos[4] = new ArbolManzano( 5,22,198,205);
	 ExperimentoManzana experimentoManzana = new ExperimentoManzana();
	 Vista vista = new Vista();
	 vista.setArboles(manzanos);
	 vista.setExperimento(experimentoManzana);
	 vista.run();
	 }
	}

