package dz3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruitsList = new ArrayList<>();

    public Box(T... fruits) {
        for (T fruit : fruits) {
            fruitsList.add(fruit);
        }
    }

    /**
     * метод для добавления фрукта в корзину
     *
     * @param fruit - тот самый фрукт
     */
    public void putFruit(T fruit) {
        fruitsList.add(fruit);
    }

    /**
     * @return вес корзины (количество фруктов * вес одного фрукта)
     */
    public float getWeight() {
        if (fruitsList.size() == 0) {
            return 0;
        }

        int Size = fruitsList.size();
        float weightFruit = fruitsList.get(0).getWeight();
        return Size * weightFruit;
    }

    /**
     * Внутри класса Box сделать метод compare(),
     * который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
     * true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     */
    public boolean compare(Box<Apple> anotherBox) {
        float weightThis = this.getWeight();
        float weightAnother = anotherBox.getWeight();
        return weightThis == weightAnother;
    }

    /**
     * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     */
    public void moveFruitToAnotherBox(Box<T> anotherBox) {
        if (fruitsList.size() == 0) {
            return;
        }

        for (T fruit: fruitsList) {
            anotherBox.putFruit(fruit);
        }
        this.fruitsList.clear();
    }
}
