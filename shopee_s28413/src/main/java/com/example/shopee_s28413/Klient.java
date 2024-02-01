package com.example.shopee_s28413;

public class Klient {
    int Id;
    double Saldo;

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public Klient(int id, double saldo) {
        this.Id = id;
        this.Saldo = saldo;
    }
    public boolean mozekupic(double koszt){return koszt <=getSaldo();}

    public void zaMalo (double koszt) {
        this.Saldo -= koszt;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setSaldo(int saldo) {
        this.Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id=" + Id +
                ", saldo=" + Saldo +
                '}';
    }
}
