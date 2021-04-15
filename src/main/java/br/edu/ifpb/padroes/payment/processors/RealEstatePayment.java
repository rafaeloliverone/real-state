package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;

public class RealEstatePayment extends PaymentProcessor {
    PaymentProcessor sucessor;

    public RealEstatePayment(PaymentProcessor sucessor) {
        super(sucessor);
        this.sucessor = sucessor;
    }

    @Override
    public void process(Property property) {
        double realStateComission = property.getPrice()*0.10;
        System.out.println(String.format("Pay %f for real state", realStateComission));

        if (this.sucessor != null) {
            this.sucessor.process(property);
        }

    }
}

