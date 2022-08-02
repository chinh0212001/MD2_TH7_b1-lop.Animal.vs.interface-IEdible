package animals;

import animals.itest.Chicken;
import animals.itest.IEdible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
         if (animal instanceof Chicken){
             IEdible edible = (Chicken) animal;
             System.out.println(animal.makeSoud());
             System.out.println(edible.howtoEat());
//             System.out.println(animal.makeSoud());
//             System.out.println(((Chicken) animal).howtoEat());
         }else {
             System.out.println(animal.makeSoud());
         }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for ( Fruit fruit : fruits){
            System.out.println(fruit.howtoEat());

        }
        }
    }

