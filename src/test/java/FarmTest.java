import junit.framework.TestCase;
import model.Bird;

public class FarmTest extends TestCase {
    public FarmTest(String name) {
           super(name);
    }

    public void BirdTest() {
        Bird bird = new Bird();
        TestCase.assertEquals(bird, null);
    }
}

