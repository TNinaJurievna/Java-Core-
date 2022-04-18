package dz5;

import java.io.*;
import java.util.ArrayList;

public class DataStore {
    private File inputFile = new File("src/main/java/dz5/input.csv");
    private File outputFile = new File("src/main/java/dz5/output.csv");

    void save(AppData appData) {
        ArrayList<String> textLinesFromAppData = getTextLinesFromAppData(appData);
        writeStringsToFile(textLinesFromAppData);
    }

    AppData readFromFile() {
        if (inputFile.exists()) {
            ArrayList<String> textLinesFromFile = getTextLinesFromFile(inputFile);
            if (textLinesFromFile.isEmpty()) {
                return null;
            } else {
                return parseStringAsAppData(textLinesFromFile);
            }
        } else {
            System.out.println("inputFile не найден");
            return null;
        }
    }

    private ArrayList<String> getTextLinesFromFile(File inputFile) {
        ArrayList<String> listOfLines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                listOfLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }

    private AppData parseStringAsAppData(ArrayList<String> textLinesFromFile) {
        if (textLinesFromFile.isEmpty())
            return null;
        else {
            String headersLine = textLinesFromFile.get(0);
            String[] header = headersLine.split(";");

            ArrayList<String> onlyDataLinesFromFile = new ArrayList<>(textLinesFromFile.subList(1, textLinesFromFile.size()));

            int[][] data = new int[onlyDataLinesFromFile.size()][header.length];

            for (int rowIndex = 0; rowIndex < onlyDataLinesFromFile.size(); rowIndex++) {
                String[] dataLine = onlyDataLinesFromFile.get(rowIndex).split(";");
                for (int columnIndex = 0; columnIndex < dataLine.length; columnIndex++) {
                    try {
                        int value = Integer.parseInt(dataLine[columnIndex]);
                        data[rowIndex][columnIndex] = value;
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
            return new AppData(header, data);
        }
    }

    private ArrayList<String> getTextLinesFromAppData(AppData appData) {
        StringBuilder headerResult = new StringBuilder();
        for (String header : appData.getHeader()) {
            if (headerResult.toString().isBlank()) {
                headerResult = new StringBuilder(header);
            } else {
                headerResult.append(";").append(header);
            }
        }

        ArrayList<String> resultArray = new ArrayList<>();
        resultArray.add(headerResult.toString());

        for (int[] dataLine : appData.getData()) {
            StringBuilder dataLineResult = new StringBuilder();
            for (int value: dataLine) {
                if (dataLineResult.toString().isBlank()) {
                    dataLineResult = new StringBuilder(String.valueOf(value));
                } else {
                    dataLineResult.append(";").append(value);
                }
            }
            resultArray.add(dataLineResult.toString());
        }

        return resultArray;
    }

    private void writeStringsToFile(ArrayList<String> textLinesFroFile) {
        if (outputFile.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (int i = 0; i < textLinesFroFile.size(); i++) {
                    if (i == textLinesFroFile.size() - 1) {
                        writer.write(textLinesFroFile.get(i));
                    } else {
                        writer.write(textLinesFroFile.get(i) + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
