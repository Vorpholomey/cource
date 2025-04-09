package Lession6;

public class SearchMinMax {
    public static void searchMinMax(String[] sentences) {
        String maxString = "";
        String minString = "";
        int indexMaxString = 0;
        int indexMinString = 0;


        for (int i = 0; i < sentences.length; i++) {
            if (maxString.length() < sentences[i].length()) {
                maxString = sentences[i];
                indexMaxString = i;
            }
            if (minString.length() > sentences[i].length()) {
                minString = sentences[i];
                indexMinString = i;
            }
        }
        System.out.println("Максимальная сторка находится под индексом: " + indexMaxString + "\n" + maxString);
        System.out.println("Минимальная  сторка находится под индексом: " + indexMinString + "\n" + minString);

    }
}
