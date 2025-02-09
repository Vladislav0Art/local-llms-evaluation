package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attribute attribute = attributes.iterator().next();
        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

}