package dz5;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void toConsoleString() {
        System.out.println(Arrays.toString(header));
        for (int[] line: data) {
            System.out.println(Arrays.toString(line));
        }
    }
}
