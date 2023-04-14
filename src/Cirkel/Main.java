package Cirkel;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = new Cirkel(10);

        try {

            Cirkel c2 = new Cirkel(-6);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            Cirkel c2 = new Cirkel(6);
        }
    }
}
