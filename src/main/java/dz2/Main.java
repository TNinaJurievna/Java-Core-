package dz2;

public class Main {
    public static void main(String[] args) {
        String[][] twoDimArrayRight = {{"23", "59", "0", "0"}, {"3", "20", "1", "4"}, {"23", "7", "10", "0"}, {"29529", "5559", "440", "7520"}};
        String[][] twoDimArrayWrong = {{"23", "59", "0", "0"}, {"3", "1", "1", "4"}, {"23", "7", "10", "0"}, {"29529", "5559", "440", "lol"}};

        try {
            int sumOfValues = checkArraySize(twoDimArrayRight);
            System.out.println("сумма элементов массива = " + sumOfValues);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            int sumOfValues = checkArraySize(twoDimArrayWrong);
            System.out.println("сумма элементов массива = " + sumOfValues);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int checkArraySize(String[][] arrayToCheck) throws MyArraySizeException, MyArrayDataException {
        int rowCount = arrayToCheck.length;
        int columnCount = arrayToCheck[0].length;

        if (rowCount == 4 && columnCount == 4) {
            System.out.println("Все верно с размерностью массива :)");
        } else {
            throw new MyArraySizeException("Возникла проблема с размерностью массива");
        }

        int sum = 0;

        for (int i = 0; i < arrayToCheck.length; i++) {
            for (int j = 0; j < arrayToCheck[0].length; j++) {
                String valueString = arrayToCheck[i][j];

                try {
                    int resultInt = Integer.parseInt(valueString);
                    sum = sum + resultInt;
                } catch (Exception exception) {
                    throw new MyArrayDataException("Неверные данные лежат в ячейке [" + i + ", " + j + "]");
                }
            }
        }

        return sum;
    }
}
