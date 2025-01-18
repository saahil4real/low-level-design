import base.BasePizza;
import base.Margherita;
import toppings.ExtraCheese;
import toppings.Mushrooms;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizza pizzaMargherita = new Margherita();
        BasePizza margheritaMushrooms = new Mushrooms(new Margherita());
        BasePizza margheritaMushroomsCheese = new ExtraCheese(new Mushrooms(new Margherita()));

        System.out.println("Cost of Margherita: " + pizzaMargherita.cost());
        System.out.println("Cost of Margherita with Mushrooms topping: " + margheritaMushrooms.cost());
        System.out.println("Cost of Margherita with Mushrooms topping and extra cheese: " + margheritaMushroomsCheese.cost());
    }
}