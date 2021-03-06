package pl.dominisz.java8desktop;
import static pl.dominisz.java8desktop.StringUtils.toDouble;

public class Defibrillator{

    int number;
    String name;
    String address;
    String phoneNumber;
    Point location;

    static Defibrillator createDefibrillator(String description) {

        String[] tokens = description.split(";");
        Defibrillator defibrillator = new Defibrillator();

        defibrillator.number = Integer.parseInt(tokens[0]);
        defibrillator.name = tokens[1];
        defibrillator.address = tokens[2];
        defibrillator.phoneNumber = tokens[3];
        defibrillator.location = new Point(StringUtils.toDouble(tokens[4]),
        StringUtils.toDouble(tokens[5]));

        return defibrillator;
    }
}


