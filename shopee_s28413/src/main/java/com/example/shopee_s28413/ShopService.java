package com.example.shopee_s28413;

import org.springframework.stereotype.Service;

@Service
public class ShopService {
    private Storage storage;

    public String KupProdukt(Koszyk koszyk){
        double koszykCena = storage.cenaSprawdz(koszyk.getListazakup());
        if(!koszyk.getKlient().mozekupic(koszykCena)){
            return "za malo pieniedzy";
        }
        koszyk.getKlient().zaMalo(koszykCena);
        return "wystarczająca ilość gotówki";
    }

    public ShopService(Storage storage) {
        this.storage = storage;
    }
}
