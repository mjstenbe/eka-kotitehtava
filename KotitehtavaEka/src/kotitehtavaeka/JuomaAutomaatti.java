package kotitehtavaeka;

import java.util.Random;

public class JuomaAutomaatti {
    
    private int teetä;
    private int kahvia;
    private int kaakaota;
    
    private Random randomi = new Random();
    
    public JuomaAutomaatti() {
        
        this.teetä = 50;
        this.kahvia = 50;
        this.kaakaota = 50;
    }
    
    public void valmistaTee() {
        
        if (!onnistuuko()) {
            System.out.println("Ei onnistu, kiitos kuitenkin maksustasi");
        } else if (this.teetä > 0) {
            this.teetä = this.teetä - 10;
            System.out.println("Odota hetki, teetä valmistetaan");
            System.out.println(toString());
        } else {
            System.out.println("Teetä ei ole enää jäljellä! Täytä säiliö");
            System.out.println(toString());
        }
    }
    
    public void valmistaKahvi() {
        
        if (!onnistuuko()) {
            System.out.println("Ei onnistu, kiitos kuitenkin maksustasi");
        } else if (this.kahvia > 0) {
            this.kahvia = this.kahvia - 10;
            System.out.println("Odota hetki, kahvia valmistetaan");
            System.out.println(toString());
        } else {
            System.out.println("Kahvia ei ole enää jäljellä! Täytä säiliö.");
            System.out.println(toString());
        }
    }
    
    public void valmistaKaakao() {
        
        if (!onnistuuko()) {
            System.out.println("Ei onnistu, kiitos kuitenkin maksustasi");
        } else if (this.kaakaota > 0) {
            this.kaakaota = this.kaakaota - 10;
            System.out.println("Odota hetki, kaakaota valmistetaan");
            System.out.println(toString());
        } else {
            System.out.println("Kaakaota ei ole enää jäljellä! Täytä säiliö.");
            System.out.println(toString());
        }
    }
    
    public String toString() {
        return "Teetä jäljellä: " + this.teetä + ", kahvia jäljellä: " + 
                this.kahvia + ", kaakaota jäljellä: " + this.kaakaota;
    }
    
    // 25% mahdollisuus epäonnistua toteutettu Random-luokalla, joka arpoo 
    // yhden neljästä numerosta (0-3), joista 0 edustaa epäonnistumista
    public boolean onnistuuko() {
        
        int sokeaSattuma = randomi.nextInt(4);
        if (sokeaSattuma == 0) {
            return false;
        } else {
            return true;
        }
    }
}
