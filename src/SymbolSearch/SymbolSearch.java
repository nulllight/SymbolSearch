package SymbolSearch;

import java.util.Scanner;

public class SymbolSearch {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args []) {
        System.out.println("Введите любое слово");
        String str = scanner.nextLine();
        char[] repit = str.toCharArray();
        int count = 0;
        System.out.println("Ваша строка: " + str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (repit[i] == repit[j]) {
                    count ++;
                    break;
                }
            }
        }
        System.out.println("Количество повторов символов равно "+ count);
    }
}