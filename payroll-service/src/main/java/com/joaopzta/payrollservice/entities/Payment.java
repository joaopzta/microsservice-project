package com.joaopzta.payrollservice.entities;

import lombok.*;

import java.io.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal() {
        return days * dailyIncome;
    }

}
