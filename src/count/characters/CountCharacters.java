package count.characters;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Characters: ");
        String str = "Vu Hoang Tuan";
        int count = 0;
        char characters = scanner.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (characters == str.charAt(i)) {
                count += 1;
            }
        }
        System.out.println("String has " + count + " is character: " + characters);
    }
}
