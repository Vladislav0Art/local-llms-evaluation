package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attribute attribute = attributes.asList().get(0);
        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

}