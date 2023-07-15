package service;

import model.Food;

public class ShoppingCart {

    protected Food [] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }
        /**Сумма товаров без скидки**/
    public double getTotalAmountWithoutDiscounts() {
        double totalAmountWithoutDiscounts = 0;
        for (int i = 0; i < foods.length; i++) {
            totalAmountWithoutDiscounts += foods[i].getAmount() * foods[i].getPrice();
        }
        return totalAmountWithoutDiscounts;

    }

    /**Сумма товаров со скидкой**/
    public double getTotalAmountWithDiscounts() {
        double totalAmountWithDiscounts = 0;
        for (int i = 0; i < foods.length; i++) {
            totalAmountWithDiscounts += foods[i].getAmount() * (foods[i].getDiscount() / (foods[i].getPrice()) * 100);
        }
        return totalAmountWithDiscounts;
    }
    /**Сумма товаров без скидки (вегетарианские) **/
    public double getVegetarianAmountWithoutDiscounts() {
        double vegetarianAmountWithoutDiscounts = 0;

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                vegetarianAmountWithoutDiscounts += foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return vegetarianAmountWithoutDiscounts;
    }
}