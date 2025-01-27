package org.example;


import java.util.Stack;

public class Main {
    public static boolean checkForPalindrome(String input) {
        // Sadece harfleri al ve küçük harfe dönüştür
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Stack kullanarak palindrom kontrolü yapalım
        Stack<Character> stack = new Stack<>();

        // Stack'e harfleri ekleyelim
        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        // Palindrom kontrolü yapalım
        for (char c : cleanedInput.toCharArray()) {
            if (stack.pop() != c) {
                return false;  // Eğer stack'ten çıkan karakter, orijinal karakterle uyuşmazsa palindrom değil
            }
        }

        return true;  // Tüm karakterler eşleşiyorsa, palindromdur
    }



    public static String convertDecimalToBinary(int decimalNumber) {
        // Boş bir stack oluşturuyoruz.
        Stack<Integer> stack = new Stack<>();

        // Decimal sayıyı 2'ye bölüyoruz ve kalanları stack'e ekliyoruz.
        while (decimalNumber > 0) {
            stack.push(decimalNumber % 2); // Kalanı stack'e ekle
            decimalNumber = decimalNumber / 2; // Sayıyı 2'ye bölüyoruz.
        }

        // Stack'teki elemanları string olarak birleştireceğiz.
        StringBuilder binaryNumber = new StringBuilder();

        // Stack'ten elemanları çıkartarak binary formatta döndürüyoruz.
        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop());
        }

        // Binary sayıyı döndürüyoruz.
        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        boolean result = checkForPalindrome("ada");
        System.out.println("Sonuç: " + result);
    }

}