package br.com.goaheadtech.statemachine.services;

import br.com.goaheadtech.statemachine.enums.PaymentEvent;
import br.com.goaheadtech.statemachine.enums.PaymentState;
import br.com.goaheadtech.statemachine.model.Payment;
import org.springframework.statemachine.StateMachine;


public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
