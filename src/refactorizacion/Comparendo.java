package refactorizacion;

public class Comparendo {
    private Camion camion;
    private Carro carro;
    private Mula mula;

    public Comparendo() {
    }

    public Comparendo(Camion camion, Carro carro, Mula mula) {
        this.camion = camion;
        this.carro = carro;
        this.mula = mula;
    }


    public String enviarCorreoFotomulta(String tipoVehiculo) {
        if(tipoVehiculo == "CAMION") {
            return "Asunto: comparendo para CAMION \nEnviando correo para el tipo CAMION";
        }else if(tipoVehiculo == "CARRO") {
            return "Asunto: comparendo para CARRO \nEnviando correo para el tipo CARRO";
        }else if(tipoVehiculo == "MULA") {
            return "Asunto: comparendo para MULA \nEnviando correo para el tipo MULA";
        } else {
            return "Enviando correo con vehiculo desconocido";
        }
    }

    public int calcularComparendo(int velocidadVehiculo, String tipoVehiculo) {
        Carro carro = new Carro();
        Camion camion = new Camion();
        Mula mula = new Mula();

        if(tipoVehiculo.equals("CARRO")){
            if(velocidadVehiculo<= carro.getLimiteInferior()) {
                return 0;
            }else if (velocidadVehiculo >= carro.getLimiteInferiorIntermedio() && velocidadVehiculo<= carro.getLimiteSuperior()) {
                return 1;
            }
            return 2;
        }
        if(tipoVehiculo.equals("CAMION")) {
            if(velocidadVehiculo<=camion.getLimiteInferior()) {
                return 0;
            }else if (velocidadVehiculo >=camion.getLimiteInferiorIntermedio() && velocidadVehiculo<=camion.getLimiteSuperior()) {
                return 1;
            }
            return 2;
        }
        if(tipoVehiculo.equals("MULA")) {
            if(velocidadVehiculo<=mula.getLimiteInferior()) {
                return 0;
            }else if (velocidadVehiculo >=mula.getLimiteInferiorIntermedio() && velocidadVehiculo<=mula.getLimiteSuperior()) {
                return 1;
            }
            return 2;
        }
        return -1;
    }

    public void construirFotoMulta(int velocidadVehiculo, String tipoVehiculo) {
        int tipoComparendo = calcularComparendo(velocidadVehiculo, tipoVehiculo);
        String textoCorreoEnviado = enviarCorreoFotomulta(tipoVehiculo);

        if(tipoComparendo == -1){
            System.out.println("no hay calculo para el tipo de vehiculo " + tipoVehiculo +"\n"+ "Correo: " + textoCorreoEnviado);
        }else {
            System.out.println("El tipo de comparendo es: " + tipoComparendo +"\n"+ "Correo: \n" + textoCorreoEnviado);
        }
    }
}
