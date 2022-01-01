package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Pension pensionImpl = new PensionImpl("Büşra", BigDecimal.valueOf(4000),3);

        System.out.println("Total: "+ pensionImpl.pay() +"TL salary paid");
        System.out.println();

        Pension firstMonthPromotion = new FirstMonthPromotion(new PensionImpl("Buğra", BigDecimal.valueOf(4000),1));
        System.out.println("Total: "+ firstMonthPromotion.pay() +"TL salary paid");
        System.out.println();

        Pension annualPromotion = new AnnualPromotion(new PensionImpl("Fırat", BigDecimal.valueOf(4000),12));
        System.out.println("Total: "+ annualPromotion.pay() +"TL salary paid");
        System.out.println();

    }
}
