package de.hfu;
import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Geben Sie Ihren Text ein:" );
        text = scanner.nextLine();

        System.out.print("Ihr eingegebener Text in Großbuchstaben war: ");
        System.out.print(text.toUpperCase());
        System.out.println();
    }
}
