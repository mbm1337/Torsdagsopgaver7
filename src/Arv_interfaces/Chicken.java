package Arv_interfaces;

class Chicken extends Animal implements Edible{




    @Override
    public String sound() {

        return "Bok";
    }

    @Override
    public String howToEat() {

        return "Cook before eating";
    }

}
