package com.joaopzta.payrollservice.controllers;

import com.joaopzta.payrollservice.entities.*;
import com.joaopzta.payrollservice.services.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable("workerId") Long workerId,
                                              @PathVariable("days") Integer days) {
        var payment = paymentService.getPayment(workerId, days);

        return ResponseEntity.ok(payment);
    }

}
