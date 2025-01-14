
import java.util.Scanner;

public class OWpicker {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Choose: DPS(1) Support(2) Tank(3): ");
            int role = input.nextInt();
            if (role == 1) {
                double DPScharacterNumber = Math.random() * (17 - 1 + 1) + 1;
                switch ((int) DPScharacterNumber) {
                    case 1:
                        System.out.println("Ashe");
                        break;
                    case 2:
                        System.out.println("Bastion");
                        break;
                    case 3:
                        System.out.println("Cassidy");
                        break;
                    case 4:
                        System.out.println("Echo");
                        break;
                    case 5:
                        System.out.println("Genji");
                        break;
                    case 6:
                        System.out.println("Hanzo");
                        break;
                    case 7:
                        System.out.println("Junkrat");
                        break;
                    case 8:
                        System.out.println("Mei");
                        break;
                    case 9:
                        System.out.println("Pharah");
                        break;
                    case 10:
                        System.out.println("Reaper");
                        break;
                    case 11:
                        System.out.println("Sojourn");
                        break;
                    case 12:
                        System.out.println("Soldier: 76");
                        break;
                    case 13:
                        System.out.println("Sombra");
                        break;
                    case 14:
                        System.out.println("Symmetra");
                        break;
                    case 15:
                        System.out.println("Torbjorn");
                        break;
                    case 16:
                        System.out.println("Tracer");
                        break;
                    case 17:
                        System.out.println("Widowmaker");
                        break;
                }
            } else if (role == 2) {
                double supportCharacterNumber = Math.random() * (10 - 1 + 1) + 1;
                switch ((int) supportCharacterNumber) {
                    case 1:
                        System.out.println("Ana");
                        break;
                    case 2:
                        System.out.println("Baptiste");
                        break;
                    case 3:
                        System.out.println("Brigitte");
                        break;
                    case 4:
                        System.out.println("Kiriko");
                        break;
                    case 5:
                        System.out.println("Lucio");
                        break;
                    case 6:
                        System.out.println("Mercy");
                        break;
                    case 7:
                        System.out.println("Moira");
                        break;
                    case 8:
                        System.out.println("Zenyatta");
                        break;
                    case 9:
                        System.out.println("LifeWeaver");
                        break;
                    case 10:
                        System.out.println("Illari");
                        break;
                }
            } else if (role == 3) {
                double tankCharacterNumber = Math.random() * (12 - 1 + 1) + 1;
                switch ((int) tankCharacterNumber) {
                    case 1:
                        System.out.println("Dva");
                        break;
                    case 2:
                        System.out.println("Doomfist");
                        break;
                    case 3:
                        System.out.println("Junker queen");
                        break;
                    case 4:
                        System.out.println("Orisa");
                        break;
                    case 5:
                        System.out.println("Ramattra");
                        break;
                    case 6:
                        System.out.println("Reinhardt");
                        break;
                    case 7:
                        System.out.println("Roadhog");
                        break;
                    case 8:
                        System.out.println("Sigma");
                        break;
                    case 9:
                        System.out.println("Winston");
                        break;
                    case 10:
                        System.out.println("Wrecking ball");
                        break;
                    case 11:
                        System.out.println("Zarya");
                        break;
                    case 12:
                        System.out.println("Mauga");
                        break;
                }
            } else {
                System.out.println("Please choose an integer respectively");
            }
        } catch (Exception b) {
            System.out.println("Invalid input!");
        }
    }
}
