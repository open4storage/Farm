package model;

import junit.framework.TestCase;

public class FarmTest extends TestCase {
    public FarmTest(String name) {
           super(name);
    }

    public void testBird() {
        Bird bird = new Bird();
        TestCase.assertNotNull(bird);
    }

    public void testHorse() {
        Horse horse = new Horse();
        TestCase.assertNotNull(horse);
    }
}

