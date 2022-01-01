package com.company;

import java.math.BigDecimal;

public class AnnualPromotion extends PensionDecorator {

    public AnnualPromotion(Pension decoratedPension){

        super(decoratedPension);
    }

    @Override
    public BigDecimal pay(){

        return decoratedPension.pay().add(getAnnualPromotion());
    }

    private BigDecimal getAnnualPromotion(){

        return BigDecimal.valueOf(1500);
    }
}


