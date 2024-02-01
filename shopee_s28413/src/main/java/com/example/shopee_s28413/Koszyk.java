package com.example.shopee_s28413;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    Klient klient;

    private List<String> listazakup;

    public Koszyk(Klient klient){
        this.klient = klient;
        this.listazakup = new ArrayList<>();
    }

    public Klient getKlient(){
        return klient;
    }

    public void setKlient(Klient klient){
        this.klient = klient;
    }

    public List<String> getListazakup(){
        return listazakup;
    }

    public void setListazakup(List<String> listazakup){
        this.listazakup = listazakup;
    }

    public void addKoszyk(String item){
        listazakup.add(item);
    }

}


