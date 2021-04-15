package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;

public class PropertyPayment extends PaymentProcessor {
    PaymentProcessor sucessor;

    public PropertyPayment(PaymentProcessor sucessor) {
        super(sucessor);
        this.sucessor = sucessor;
    }

    @Override
    public void process(Property property) {
        double propertyDeed = property.getPrice();
        System.out.println(String.format("Pay %f for the property", propertyDeed));

        if (this.sucessor != null) {
            this.sucessor.process(property);
        }
    }
}

