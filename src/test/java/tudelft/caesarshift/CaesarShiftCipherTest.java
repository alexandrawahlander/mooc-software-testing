package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;;

public class CaesarShiftCipherTest {
    @Test
            //Hittade en bugg att från och med andra till och med näst sista bokstaven, så blir det dubbla bokstäver.
    public void validLetters(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abcde", 1);
        Assertions.assertEquals("bcdef", result);
    }

    @Test
    public void InvalidLetters(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("åäö", 1);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void mitten(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("cdef", 1);
        Assertions.assertEquals("defg", result);
    }

    @Test
    public void EnBokstav(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("u", 1);
        Assertions.assertEquals("v", result);
    }
}
