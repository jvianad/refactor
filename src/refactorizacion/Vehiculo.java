package refactorizacion;

public abstract class Vehiculo {
    private int limiteInferior;
    private int limiteInferiorIntermedio;
    private int limiteSuperior;

    public Vehiculo(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public void setLimiteInferiorIntermedio(int limiteInferiorIntermedio) {
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }
}
