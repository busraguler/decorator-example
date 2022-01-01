package com.company;

import java.math.BigDecimal;

public class PensionImpl implements Pension {
    private final String name;
    private final BigDecimal salary;

    public PensionImpl(String name, BigDecimal salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public BigDecimal pay(){
        System.out.println(name + ":");
        return this.salary;
    }
}
