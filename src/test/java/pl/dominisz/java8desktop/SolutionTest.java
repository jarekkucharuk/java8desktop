package pl.dominisz.java8desktop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void findNearest() {
        Solution testDef=new Solution();
        Point testPoint=new Point(234.3,123.6);
        User testUser=new User(testPoint);
        List<Defibrillator> testDefibrillators=new ArrayList<>();
        Defibrillator testDef1 = Defibrillator.createDefibrillator("1;Maison de la Prevention Sante;6 rue Maguelone 340000 Montpellier;;3,87952263361082;43,607128533921");
        Defibrillator testDef2 = Defibrillator.createDefibrillator("2;Hotel de Ville;1 place Georges Freche 34267 Montpellier;;3,89652239197876;43,5987299452849");
        testDefibrillators.add(testDef1);
        testDefibrillators.add(testDef2);

        System.out.println(testDef.findNearest(testUser,testDefibrillators).name);
    }

}