package com.example.shopee_s28413;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopeeS28413Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShopeeS28413Application.class, args);
	}


	private final ShopService shopService;
	@Autowired
	public ShopeeS28413Application(ShopService shopService) {
		this.shopService = shopService;
	}

	@Override
	public void run(String... args){
		Klient klient = new Klient(1, 120000000);
		Koszyk koszyk = new Koszyk(klient);
		koszyk.addKoszyk("beer");
		koszyk.addKoszyk("milk");
		koszyk.addKoszyk("milk");
		System.out.println(shopService.KupProdukt(koszyk));
	}







}
