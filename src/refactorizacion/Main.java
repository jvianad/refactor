package refactorizacion;

public class Main {
    public static void main(String[] args) {
        //probando los diferntes tipos de multa
        Comparendo comparendo = new Comparendo();
        comparendo.construirFotoMulta(80,"CARRO");
        System.out.println();
        comparendo.construirFotoMulta(200,"MULA");
        System.out.println();
        comparendo.construirFotoMulta(75,"CAMION");
        System.out.println();
        comparendo.construirFotoMulta(200,"AVION");
    }
}

