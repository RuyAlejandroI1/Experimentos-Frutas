package ExperimentoDurazno;

import ManzanosyDuraznos.ArbolDuraznos;

public class ExperimentoD {
private ArbolDuraznos[] duraznos;
public int getPromedioNumeroDuraznos() {
int suma =0;
for(int i=0;i<5;i++) {
suma = suma+duraznos[i].getNumeroFrutas();
}
return suma/5;
}
public int getPromedioAlturaArbolDurazno() {
int suma =0;
for(int i=0;i<5;i++) {
suma = suma+duraznos[i].getAlturaCm();
}
return suma/5;
}
public int getPromedioPesoDurazno() {
int suma =0;
for(int i=0;i<5;i++) {
suma = suma+duraznos[i].getPesoPromedioFruta();
}
return suma/5;
}
public void setDuraznos(ArbolDuraznos[] duraznos) {
this.duraznos = duraznos;
}
}
