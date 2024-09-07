import tipos.Camion;
import tipos.Coche;
import tipos.Moto;
import tipos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        //Instancias
        Vehiculo v1 = new Camion(1000);
        Vehiculo v2 = new Coche(1000);
        Vehiculo v3 = new Moto(1000);

        //Resultados
        System.out.println();
        System.out.println("Distancia a recorrer: 1000 km");
        System.out.println("Costo de enviarlo por camion es: $" + v1.calcCost());
        System.out.println("Costo de enviarlo por coche: $" + v2.calcCost());
        System.out.println("Costo de enviarlo por moto: $" + v3.calcCost());



    }
}