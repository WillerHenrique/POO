package br.newtonpaiva.dominio;

public class Conta implements Transferencia {
    private Integer numero;
    protected Double saldo;

    public Double sacar(Double valor) {
        return 0.0;
    }
    public Double depositar(Double valor) {
        return 0.0;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
