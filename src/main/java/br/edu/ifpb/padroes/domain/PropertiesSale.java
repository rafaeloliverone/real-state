package br.edu.ifpb.padroes.domain;

import br.edu.ifpb.padroes.payment.PropertiesSaleAbstract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertiesSale implements Property {
    public float price;
    List<Property> listProperties = new ArrayList<>();

    public void add(Property property){
        this.listProperties.add(property);
    }

    public void remove(Property property){
        this.listProperties.remove(property);
    }

    @Override
    public float getPrice() {
        float sumTotal = 0;
        for(Property single: this.listProperties){
        	sumTotal += single.getPrice();
        }
        this.price = sumTotal;
        return this.price;
    }
}
