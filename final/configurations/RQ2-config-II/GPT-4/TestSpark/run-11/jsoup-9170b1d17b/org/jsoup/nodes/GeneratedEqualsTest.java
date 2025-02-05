package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes testAttributes1 = new Attributes();
        Attributes testAttributes2 = new Attributes();
        testAttributes1.add("key", "value");
        testAttributes2.add("key", "value");

        assertTrue(testAttributes1.equals(testAttributes2));
    }

}