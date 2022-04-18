package dz5;

public class Main {
    public static void main(String[] args) {
        task2();
    }
    public static void task1() {
        String[] headers = {"Header0", "Header1", "Header2", "Header2"};
        int[][] data = {{0, 1, 2, 7}, {3, 4, 5, 8}, {6, 7, 8, 9}};
        AppData appData = new AppData(headers, data);

        DataStore dataStore = new DataStore();
        dataStore.save(appData);
    }

    public static void task2() {
        DataStore dataStore = new DataStore();
        AppData appData = dataStore.readFromFile();
        appData.toConsoleString();
    }
}
