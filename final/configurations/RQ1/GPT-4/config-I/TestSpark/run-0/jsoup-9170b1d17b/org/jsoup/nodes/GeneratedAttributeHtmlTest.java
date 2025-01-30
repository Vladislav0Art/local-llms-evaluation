package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributeHtmlTest {

    @Test
    public void attributeHtmlTest() {
        Attribute attribute = new Attribute("key", "value");

        assertEquals("key=\"value\"", attribute.html());
    }

}