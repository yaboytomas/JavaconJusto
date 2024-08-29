package tipos;

public abstract class Vehiculo {

    //Atributos
    private int distanciaKM;

    //Getter
    public int getDistanciaKM() {
        return distanciaKM;
    }

    //Constructor
    public Vehiculo(int distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    //Metodos
    public abstract int calcCost();   // abtracto porque por cada clase hija cambie el calculo.


}
