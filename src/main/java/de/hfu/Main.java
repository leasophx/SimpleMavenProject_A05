package de.hfu;


import java.util.Scanner;



/**
 * Dieses Projekt ist ein Beispielprojekt (Maven).
 * Das Ziel ist die Umwandlung des eingegebenen Texts in Grossbuchstaben.
 * Aufgabenblatt05-OSSE
 * @author LeaSophie
 * @version 1.0
 */

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
