package pl.dominisz.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void distanceTo() {

        Point testPoint = new Point(2.4,7.6);
        System.out.println(testPoint.distanceTo(new Point(0,0)));
    }

}