package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        element.text("Hello, World");
        assertEquals("Hello, World", element.text());
    }

}