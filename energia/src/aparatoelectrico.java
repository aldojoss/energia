public class aparatoelectrico {

    private String name;
    private double usodiario;
    private double volteos;
    private double consumomensual;

public aparatoelectrico(String name, double usodiario, double volteos, double consumomensual){
        this.name=name;
        this.usodiario=usodiario;
        this.volteos=volteos;
        this.consumomensual=consumomensual;
    }
    

















public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getUsodiario() {
    return usodiario;
}

public void setUsodiario(double usodiario) {
    this.usodiario = usodiario;
}

public double getConsumomensual() {
    return consumomensual;
}
public void setConsumomensual(double consumomensual) {
    this.consumomensual = consumomensual;
}

public double getVolteos() {
    return volteos;
}
public void setVolteos(double volteos) {
    this.volteos = volteos;
}



}
