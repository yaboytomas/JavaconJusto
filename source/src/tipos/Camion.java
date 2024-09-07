package tipos;

public class Camion extends Vehiculo {


    //Constructor
    public Camion(int distanciaKM) {
        super(distanciaKM);
    }


    @Override
    public int calcCost() {             // aca se modifica la funcion abstract ya que cada clase hija es differnte
        return getDistanciaKM() * 15;
    }
}
