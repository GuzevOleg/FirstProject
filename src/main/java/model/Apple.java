package model;

import static model.constants.Colour.*;
import static model.constants.Discount.discount;

public class Apple extends  Food implements Discountable{

    protected String colour;

    public Apple(int amount,double price, String colour){
    this.amount = amount;
    this.price = price;
    this.colour = colour;
    isVegetarian = true;
    }


    @Override
    public double getDiscount() {
        if(colour.equals(COLOUR_RED)){
            return discount;
        }else return 0;
    }

}


