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

    @Test
    public void DoubleGend(){
        GHappy ghappy = new GHappy();
        Assertions.assertTrue(ghappy.gHappy("aadgg"));
    }

    @Test
    public void shortdoubleg(){
        GHappy ghappy = new GHappy();
        Assertions.assertTrue(ghappy.gHappy("gg"));
    }

    @Test
    public void OneGonly(){
        GHappy ghappy = new GHappy();
        Assertions.assertFalse(ghappy.gHappy("g"));
    }

    @Test
    public void NoG(){
        GHappy ghappy = new GHappy();
        Assertions.assertFalse(ghappy.gHappy("jaj"));
    }
}

//Buggar: Om man hade två gg i början, så failade det. Om man inte har med något g alls så failar det.