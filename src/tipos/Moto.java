package tipos;

public class Moto extends Vehiculo {

    //Constructor
    public Moto(int distanciaKM) {
        super(distanciaKM);
    }

    @Override
    public int calcCost() {     // aca se modifica la funcion abstract ya que cada clase hija es differnte
        return getDistanciaKM() * 5;
    }
}
