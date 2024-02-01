package com.example.shopee_s28413;

import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
@Component
public class Storage {

    private Map<String, Produkt> produktMap;
    public Storage(Map<String, Produkt> produktMap) {
        this.produktMap = produktMap;
    }
    public Storage() {
        this.produktMap = new HashMap<>();
        this.addProdukt(new Produkt(1,1000, "milk"));
        this.addProdukt(new Produkt(2,1500, "beer"));
    }
    public void addProdukt(Produkt produkt){
        produktMap.put(produkt.item_name, produkt);
    }

    public double cenaSprawdz(List<String> produktList){
        double cenaCalkowita = 0;
        for (String produkt : produktList){
            if (produktMap.containsKey(produkt)) {
                cenaCalkowita += produktMap.get(produkt).koszt;
            }
        }
        return cenaCalkowita;
    }





}