package de.neuefische;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }


public static boolean isPasswordValid (String password) {  // 1. Uberlege dir wie die
    boolean containsDigit = false;
    for (int i = 0; i < password.length(); i++) {
        if ((password.charAt(i) == '0') ||
                (password.charAt(i) == '1') ||
                (password.charAt(i) == '2') ||
                (password.charAt(i) == '3') ||
                (password.charAt(i) == '4') ||
                (password.charAt(i) == '5') ||
                (password.charAt(i) == '6') ||
                (password.charAt(i) == '7') ||
                (password.charAt(i) == '8') ||
                (password.charAt(i) == '9')

        ){
    containsDigit = true;
}
        }
        if (password.length() >= 6 && containsDigit) {
                return true;
                }

                return false;
                }



}