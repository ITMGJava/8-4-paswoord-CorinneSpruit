import java.util.Scanner;

public class Paswoord {
    public static void main(String[] args) {

        boolean check = true;
        do {

            System.out.println("Voer je gebruikersnaam in");

            var x = new Scanner(System.in);
            var naam = x.nextLine();

            var user1 = "Corinne";
            var user2 = "Iris";
            var user3 = "Lisa";
            var user4 = "Rosie";

            if (naam.equals(user1)) {
                check = true;
                System.out.println("Voer je wachtwoord in");

            } else if (naam.equals(user2)) {
                check = true;
                System.out.println("Voer je wachtwoord in");

            } else if (naam.equals(user3)) {
                check = true;
                System.out.println("Voer je wachtwoord in");


            } else if (naam.equals(user4)) {
                check = true;
                System.out.println("Voer je wachtwoord in");

            } else if (naam.equals(default)) {
                check=false;
                System.out.println("Verkeerde inlognaam");

            }

                do {

                    var y = new Scanner(System.in);
                    var pw = y.nextLine();


                    var pw1 = "123";
                    var pw2 = "123";
                    var pw3 = "123";
                    var pw4 = "123";

                    if (naam.equals(user1) & pw.equals(pw1)) {
                        check = true;
                        System.out.println("Je bent ingelogd");

                    } else if (naam.equals(user2) & pw.equals(pw1)) {
                        check = true;
                        System.out.println("je bent ingelogd");

                    } else if (naam.equals(user1) & pw.equals(pw3)) {
                        check = true;
                        System.out.println("je bent ingelogd");


                    } else if (naam.equals(user1) & pw.equals(pw4)) {
                        check = true;
                        System.out.println("je bent ingelog");

                    } else if (naam.equals(false) & pw.equals(default)) {
                        System.out.println("Verkeerd wachtwoord");

                    }
                } while (!check);
//

        }while (check);


    }
}