package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveKeyTest {

    @Test
    public void removeKeyTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");
        testAttributes.remove("key");

        assertEquals("", testAttributes.get("key"));
    }

}