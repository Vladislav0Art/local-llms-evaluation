package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributeTest {

    @Test
    public void attributeTest() {
        Attribute attribute = new Attribute("key", "value");

        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());

        attribute.setKey("newKey");
        attribute.setValue("newValue");

        assertEquals("newKey", attribute.getKey());
        assertEquals("newValue", attribute.getValue());
    }

}