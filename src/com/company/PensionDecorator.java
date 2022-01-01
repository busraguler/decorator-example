package com.company;

import java.math.BigDecimal;

public abstract class PensionDecorator implements Pension{
    protected Pension decoratedPension;

    public PensionDecorator(Pension decoratedPension){
        this.decoratedPension = decoratedPension;
    }

    public BigDecimal pay(){
        return decoratedPension.pay();
    }
}
