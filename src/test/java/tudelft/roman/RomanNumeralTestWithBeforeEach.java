package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
        System.out.print("Denna körs före varje test\n");
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("V");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

 //   @Test
   // public void invalidRomanNumeral() {
 //       int result = roman.convert("C");
  //      Assertions.assertEquals(?, result);
   // }
}
