package ExperimentoDurazno;

import ManzanosyDuraznos.ArbolDuraznos;

public class VistaDurazno {
public void run() {
ArbolDuraznos[] duraznos = new ArbolDuraznos[5];
duraznos[0] = new ArbolDuraznos( 1, 15, 180, 150);
duraznos[1] = new ArbolDuraznos( 2, 16, 190, 160);
duraznos[2] = new ArbolDuraznos( 3, 17, 200, 200);
duraznos[3] = new ArbolDuraznos( 4, 16, 230, 189);
duraznos[4] = new ArbolDuraznos( 5, 16, 180, 168);
ExperimentoD exp = new ExperimentoD();
exp.setDuraznos(duraznos);
System.out.println("Rendimiento del cultivo de duraznos");
int promedioDuraznos= exp.getPromedioNumeroDuraznos();
System.out.println("Numero promedio de duraznos "+promedioDuraznos);
int promedioAlturaArbolDurazno= exp.getPromedioAlturaArbolDurazno();
System.out.println("Altura promedio de los arboles "+promedioAlturaArbolDurazno);
int promedioPesoDurazno= exp.getPromedioPesoDurazno();
System.out.println("Peso promedio de las duraznos"+promedioPesoDurazno);
}
}

