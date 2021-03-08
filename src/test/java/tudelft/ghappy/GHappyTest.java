package tudelft.ghappy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void OneG(){
        GHappy ghappy = new GHappy();
        Assertions.assertFalse(ghappy.gHappy("jag"));
    }

    @Test
    public void DoubleGbeginning(){
        GHappy ghappy = new GHappy();
        Assertions.assertTrue(ghappy.gHappy("ggaad"));
    }

    @Test
    public void DoubleG(){
        GHappy ghappy = new GHappy();
        Assertions.assertTrue(ghappy.gHappy("aaggd"));
    }
}
