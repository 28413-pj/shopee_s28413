package com.example.shopee_s28413;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShopServiceITest {
    @Autowired
    private ShopService shopService;


    @Test
    void KupProdukty(){
        Klient klient = new Klient(1, 120000000);
        Koszyk koszyk = new Koszyk(klient);
        koszyk.addKoszyk("beer");
        koszyk.addKoszyk("milk");
        koszyk.addKoszyk("milk");
        assertThat(shopService.KupProdukt(koszyk)).isEqualTo("wystarczająca ilość gotówki");
    }
    @Test
    void KupProdukt(){
        Klient klient = new Klient(1, 14);
        Koszyk koszyk = new Koszyk(klient);
        koszyk.addKoszyk("milk");
        koszyk.addKoszyk("beer");
        koszyk.addKoszyk("milk");
        assertThat(shopService.KupProdukt(koszyk)).isEqualTo("za malo pieniedzy");
    }






}
