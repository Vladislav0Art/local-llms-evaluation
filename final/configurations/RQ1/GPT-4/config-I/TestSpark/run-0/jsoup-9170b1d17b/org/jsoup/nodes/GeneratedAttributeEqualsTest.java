package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributeEqualsTest {

    @Test
    public void attributeEqualsTest() {
        Attribute attribute1 = new Attribute("key", "value");
        Attribute attribute2 = new Attribute("key", "value");

        assertTrue(attribute1.equals(attribute2));

        attribute2.setValue("newValue");
        assertFalse(attribute1.equals(attribute2));
    }

}