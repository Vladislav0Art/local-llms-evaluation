package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");

        assertTrue(testAttributes.hasKey("key"));
    }

}