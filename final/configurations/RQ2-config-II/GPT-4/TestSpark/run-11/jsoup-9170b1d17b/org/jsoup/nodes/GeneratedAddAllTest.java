package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes testAttributes = new Attributes();
        Attributes newAttributes = new Attributes();
        newAttributes.add("key", "value");
        testAttributes.addAll(newAttributes);

        assertTrue(testAttributes.hasKey("key"));
    }

}