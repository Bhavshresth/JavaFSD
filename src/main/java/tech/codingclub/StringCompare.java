package tech.codingclub;

public class StringCompare {
    public static void main(String[] args) {


        String str1 = "welcometojava";
        int n = 3;
        for (int i = 0; i < str1.length() - n + 1; i++) {
            System.out.println(str1.substring(i, i + n));
        }

        String min = str1.substring(0, n);
        String max = str1.substring(0, n);

        for (int i = 0; i < str1.length() - n + 1; i++) {
            String word = str1.substring(i, i + n);

            if (min.compareTo(word) > 0) {
                min = word;
            }
            if (max.compareTo(word) < 0) {
                max = word;
            }

        }
        System.out.println("Min word: " + min);
        System.out.println("Max word: " + max);
    }
}
//HackerRank Question java substring compare

