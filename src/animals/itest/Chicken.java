package animals.itest;


import animals.Animal;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSoud() {
        return "chicken: cluck-cluck";
    }

    @Override
    public String howtoEat() {
        return " an thoc !!";
    }
}
