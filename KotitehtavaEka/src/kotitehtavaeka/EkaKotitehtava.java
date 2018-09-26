package kotitehtavaeka;

import java.util.Scanner;

public class EkaKotitehtava {

    
    public static void main(String[] args) {
        
        JuomaAutomaatti masiina = new JuomaAutomaatti();
        
        Scanner lukija = new Scanner(System.in);
        int valinta;
        
        LOPETA:
        while (true) {
            System.out.println("**********Juoma-Automaatti**********");
            System.out.println();
            System.out.println("1. Tee");
            System.out.println("2. Kahvi");
            System.out.println("3. Kaakao");
            System.out.println("4. Lopeta");
            System.out.println();
            System.out.println("************************************");
            valinta = lukija.nextInt();
            
            switch (valinta) {
                case 1:
                    masiina.valmistaTee();
                    break;
                case 2:
                    masiina.valmistaKahvi();
                    break;
                case 3:
                    masiina.valmistaKaakao();
                    break;
                case 4:
                    break LOPETA;
                default:
                    System.out.println("Virheellinen valinta, valitse 1–4!");
                    break;
            }
        }
    }
    
}
