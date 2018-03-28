package pl.dominisz.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void toDouble() {
        StringUtils testString=new StringUtils();
        System.out.println(testString.toDouble("12132,345"));
    }
}