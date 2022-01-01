package com.company;

import java.math.BigDecimal;

public class FirstMonthPromotion extends PensionDecorator {

    public FirstMonthPromotion(Pension decoratedPension){

        super(decoratedPension);
    }

    @Override
    public BigDecimal pay(){

        return decoratedPension.pay().add(getFirstMonthPromotion());
    }

    private BigDecimal getFirstMonthPromotion(){

        return BigDecimal.valueOf(500);
    }
}

