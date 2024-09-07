package tipos;

public class Coche extends Vehiculo {

    //Constructor
    public Coche(int distanciaKM) {
        super(distanciaKM);
    }

    @Override
    public int calcCost() {     // aca se modifica la funcion abstract ya que cada clase hija es differnte
        return getDistanciaKM() * 10;
    }
}
