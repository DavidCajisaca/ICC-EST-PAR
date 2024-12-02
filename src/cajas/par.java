package cajas;

public class par <K,V> {
    private K clave;
    private V valor;
    public par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }
    public void establecerClave(K clave) {
        this.clave = clave;
    }

    public void establecerValor(V valor) {
        this.valor = valor;
    }

    public K obtenerClave() {
        return clave;
    }

    public V obtenerValor() {
        return valor;
    }
}