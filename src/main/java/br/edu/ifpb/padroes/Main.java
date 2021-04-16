package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Apartment;
import br.edu.ifpb.padroes.domain.Bungalow;
import br.edu.ifpb.padroes.domain.PropertiesSale;
import br.edu.ifpb.padroes.domain.Tenement;
import br.edu.ifpb.padroes.payment.PaymentService;

public class Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        apartment.setAddress("Rua x");
        apartment.setBuilder("Apartamento construtura");
        apartment.setPrice(200000);

        Bungalow bungalow = new Bungalow();
        bungalow.setAddress("Rua y");
        bungalow.setBuilder("Bangalô construtura");
        bungalow.setPrice(150000);

        Tenement tenament = new Tenement();
        tenament.setAddress("Rua y");
        tenament.setBuilder("Cortiço construtura");
        tenament.setPrice(100000);

        PaymentService paymentService = new PaymentService();


        PropertiesSale propertiesSale = new PropertiesSale();
        propertiesSale.add(apartment);
        propertiesSale.add(bungalow);
        propertiesSale.add(tenament);

        System.out.println(propertiesSale.getPrice());
        paymentService.pay(propertiesSale);


    }
}
