package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedHasDeclaredValueForKeyAttributeTest {

    @Test
    public void hasDeclaredValueForKeyAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasDeclaredValueForKey("key"));
    }

}