import com.sun.source.tree.WhileLoopTree;

import java.nio.charset.CoderResult;
import java.util.Scanner;

public class Paswoord {
    public static void main(String[] args) {


        var user1 = "Corinne";
        var user2 = "Iris";
        var user3 = "Lisa";
        var user4 = "Rosie";

        var x = new Scanner(System.in);


        boolean CorrecteInvoer = true;


            System.out.println("Voer je gebruikersnaam in");
            var naam = x.nextLine();


            if (naam.equals(user1) | naam.equals(user2) | naam.equals(user3) | naam.equals(user4)) {
                CorrecteInvoer = true;
                System.out.println("Gebruikersnaam correct");
            } else {
                System.out.println("Gebruikersnaam onjuist, probeer nogmaals");
            }

            System.out.println("Voer je wachtwoord in");

            var y = new Scanner(System.in);
            var pw = y.nextLine();

            var pw1 = "123";
            var pw2 = "234";
            var pw3 = "345";
            var pw4 = "456";

            if (naam.equals(user1) & pw.equals(pw1) | naam.equals(user2) & pw.equals(pw2) |
                    naam.equals(user3) & pw.equals(pw3) | naam.equals(user4) & pw.equals(pw4)) {
                CorrecteInvoer = true;
                System.out.println("Je bent ingelogd");
            } else
            {
                System.out.println("Paswoord onjuist");
            }


        }
        }








