package tipos;

public class Moto extends Vehiculo {

    //Constructor
    public Moto(int distanciaKM) {
        super(distanciaKM);
    }

    @Override
    public int calcCost() {
        return getDistanciaKM() * 5;
    }
}
