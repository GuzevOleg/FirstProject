import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import static model.constants.Colour.*;

public class Main {



    public static void main(String[] args) {
       Meat meat = new Meat(5, 100);
       Apple appleRed = new Apple(10, 50,COLOUR_RED);
       Apple appleGreen = new Apple(10, 50,COLOUR_GREEN);


       Food[] foods = new Food[3];
       foods[0] = meat;
       foods[1] = appleRed;
       foods[2] = appleGreen;


        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalAmountWithoutDiscounts());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalAmountWithDiscounts());
        System.out.println("Общая сумма всех вегетарианских товаров без скидки: " + shoppingCart.getVegetarianAmountWithoutDiscounts());


    }



}
