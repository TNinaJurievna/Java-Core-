package dz1;

public class Box {
    int height;
    int width;
    String name;

    Box(int height, int width) {
        this.height = height;
        this.width = width;
        this.name = "Box";
    }

    Box(int height, int width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }
}