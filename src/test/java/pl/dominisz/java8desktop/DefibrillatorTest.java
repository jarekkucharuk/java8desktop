package pl.dominisz.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefibrillatorTest {
    @Test
    void createDefibrillator() {

        Defibrillator testDef=new Defibrillator();
        System.out.println(testDef.createDefibrillator("1;Maison de la Prevention Sante;6 rue Maguelone 340000 Montpellier;;3,87952263361082;43,607128533921").address);
    }

}