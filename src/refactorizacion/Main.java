package refactorizacion;

public class Main {
    public static void main(String[] args) {
        //probando los diferntes tipos de multa
        //tipo 0
        Carro carro1 = new Carro(66,66,85);
        carro1.construirFotoMulta(65);
        System.out.println();
        //tipo 1
        Camion camion1 = new Camion(75,76,95);
        camion1.construirFotoMulta(78);
        System.out.println();
        //tipo 2
        Mula mula1 = new Mula(95,96,110);
        mula1.construirFotoMulta(400);
    }
}

