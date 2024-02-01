package com.example.shopee_s28413;

public class Produkt {

    int ProdID;
    double koszt;
    String item_name;

    public Produkt(int prodID, double koszt, String item_name) {
        ProdID = prodID;
        this.koszt = koszt;
        this.item_name = item_name;
    }

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int prodID) {
        ProdID = prodID;
    }

    public double getKoszt() {
        return koszt;
    }

    public void setKoszt(double koszt) {
        this.koszt = koszt;
    }

    public Produkt(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "ProdID=" + ProdID +
                ", koszt=" + koszt +
                ", item_name='" + item_name + '\'' +
                '}';
    }
}
