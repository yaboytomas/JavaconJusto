package tipos;

public class Coche extends Vehiculo {

    //Constructor
    public Coche(int distanciaKM) {
        super(distanciaKM);
    }

    @Override
    public int calcCost() {
        return getDistanciaKM() * 10;
    }
}
