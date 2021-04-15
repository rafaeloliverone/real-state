package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.processors.GovernmentTaxesPayment;
import br.edu.ifpb.padroes.payment.processors.PropertyPayment;
import br.edu.ifpb.padroes.payment.processors.RealEstatePayment;

public class PaymentService {

    public void pay(Property sale) {
        PropertyPayment propertyPayment = new PropertyPayment(null);
        RealEstatePayment realEstatePayment = new RealEstatePayment(propertyPayment);
        GovernmentTaxesPayment governmentTaxesPayment = new GovernmentTaxesPayment(realEstatePayment);

        governmentTaxesPayment.process(sale);
    }

}
