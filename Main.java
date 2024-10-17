import java.util.Scanner;

public class Main {
    private static String alphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюя";

    private static char shifr_cezarya(char symbol, int shift) {
        if (alphabet.indexOf(symbol) != -1) {
            return alphabet.charAt((alphabet.indexOf(symbol) + shift) % alphabet.length());
        } else {
            return symbol;
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine().toLowerCase();

        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < text.length(); j++) {
                System.out.print(shifr_cezarya(text.charAt(j), i));
            }
            System.out.println();
        }

    }


}