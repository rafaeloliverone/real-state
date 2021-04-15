package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public abstract class PaymentProcessor implements PaymentProcessorHandler {
    PaymentProcessor sucessor;

    public PaymentProcessor(PaymentProcessor sucessor ) {
        this.sucessor = sucessor;
    }

    public void process(Property property) {
    }

    public PaymentProcessor getSucessor() {
        return sucessor;
    }

    public void setSucessor(PaymentProcessor sucessor) {
        this.sucessor = sucessor;
    }

}
