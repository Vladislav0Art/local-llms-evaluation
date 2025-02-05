package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");
        int expectedHash = testAttributes.hashCode();

        assertEquals(expectedHash, testAttributes.hashCode());
    }

}