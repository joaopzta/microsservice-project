package com.joaopzta.payrollservice.services;

import com.joaopzta.payrollservice.entities.*;
import org.springframework.stereotype.*;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }

}
