package dz3;

public class Main {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> boxWithApples = new Box<>(apple1, apple2, apple3);
        Box<Orange> boxWithOranges = new Box<>(orange1, orange2);
        Box<Orange> boxWithOranges2 = new Box<>(orange3);


        System.out.println(boxWithApples.getWeight());
        System.out.println(boxWithOranges.getWeight());
        System.out.println(boxWithOranges2.getWeight());

        System.out.println("");
        System.out.println(boxWithOranges.compare(boxWithApples));

        boxWithOranges.moveFruitToAnotherBox(boxWithOranges2);

        System.out.println("");
        System.out.println(boxWithOranges.getWeight());
        System.out.println(boxWithOranges2.getWeight());
    }
}
