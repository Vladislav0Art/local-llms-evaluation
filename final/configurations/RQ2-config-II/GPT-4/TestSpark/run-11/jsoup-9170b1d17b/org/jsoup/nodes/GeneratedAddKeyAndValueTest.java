package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddKeyAndValueTest {

    @Test
    public void addKeyAndValueTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");

        assertEquals("value", testAttributes.get("key"));
    }

}