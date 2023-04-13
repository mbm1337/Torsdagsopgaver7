package Arv_interfaces;

class Chicken extends Animal implements Edible{




    @Override
    public String sound() {
        return "Bork";
    }

    @Override
    public String howToEat() {
        return "Cook before eating";
    }
}
