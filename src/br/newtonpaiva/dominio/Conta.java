package br.newtonpaiva.dominio;

import java.util.Objects;

public class Conta {
    private Integer numero;
    private Double saldo;
    public Conta() {
        this(null, null);
    }
    public Conta(Integer numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public Conta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double sacar(Double valor) {
        return 0.0;
    }

    public Double depositar(Double valor) {
        if (valor == null || valor <= 0)
            throw new IllegalArgumentException("Por favor digite um valor inteiro, sendo maior de 0");
        else {
            saldo = saldo + valor;
            return saldo;
        }
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
