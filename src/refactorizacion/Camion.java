package refactorizacion;

public class Camion extends Vehiculo implements iComparendo{
    public Camion(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        super(limiteInferior, limiteInferiorIntermedio, limiteSuperior);
    }

    @Override
    public String enviarCorreoFotomulta() {
        return "Asunto: Fotomulta para su CAMION \nMensaje: Se ha enviado un mensaje a su correo de la fotomulta de su CAMION";
    }

    @Override
    public int calcularComparendo(int velocidad) {
        if (velocidad <= limiteInferior){
            return 0;
        } else if (velocidad >=limiteInferiorIntermedio && velocidad<=limiteSuperior) {
            return 1;
        }
        return 2;
    }

    public void construirFotoMulta(int velocidad) {
        int nivelMulta = calcularComparendo(velocidad);
        String textoCorreoFotomulta = enviarCorreoFotomulta();
        if(nivelMulta == -1){
            System.out.println("no hay calculo para el tipo de vehiculo");
        }else {
            System.out.println("Tipo de comparendo: "+nivelMulta+"\n"+"Correo: "+"\n"+ textoCorreoFotomulta);
        }
    }


}
