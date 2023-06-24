package refactorizacion;

public abstract class Vehiculo {
    protected int limiteInferior;
    protected int limiteInferiorIntermedio;
    protected int limiteSuperior;

    public Vehiculo(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public abstract String enviarCorreoFotomulta();
    public abstract int calcularComparendo(int velocidad);

}
