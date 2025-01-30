package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributeToStringTest {

    @Test
    public void attributeToStringTest() {
        Attribute attribute = new Attribute("key", "value");

        assertEquals("key=\"value\"", attribute.toString());
    }

}