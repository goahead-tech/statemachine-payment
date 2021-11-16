package br.com.goaheadtech.statemachine.repository;

import br.com.goaheadtech.statemachine.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
