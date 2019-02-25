package com.company.BusinessLogic;

import com.company.Interfaces.ForSale;

public class DiscountManager {
    float discount;
    DiscountManager(float discount){
        this.discount=discount;
    }

    float getDiscount(){
        return this.discount;
    };

    void setDiscount(float discount){
        this.discount=discount;
    }

   void applyDiscount(ForSale forsale){
        forsale.setPrice((Integer)Math.round(forsale.getPrice()*discount));
    }
}
