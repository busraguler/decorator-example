package com.company;

import java.math.BigDecimal;

public class PensionImpl implements Pension {
    private String name;
    private BigDecimal salary;
    private Integer numberOfSalaries;

    public PensionImpl(String name, BigDecimal salary, Integer numberOfSalaries){
        this.name = name;
        this.salary = salary;
        this.numberOfSalaries = numberOfSalaries;
    }

    @Override
    public BigDecimal pay(){
        System.out.println(name + ":");
        return this.salary;
    }
}
