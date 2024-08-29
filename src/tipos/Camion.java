package tipos;

public class Camion extends Vehiculo {


    //Constructor
    public Camion(int distanciaKM) {
        super(distanciaKM);
    }

    @Override
    public int calcCost() {
        return getDistanciaKM() * 15;
    }
}
