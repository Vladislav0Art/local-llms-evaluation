package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedEqualAttributesTest {

    @Test
    public void equalAttributesTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.put("key", "value");
        attributes2.put("key", "value");
        assertTrue(attributes1.equals(attributes2));
    }

}