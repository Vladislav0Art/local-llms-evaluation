package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendTextTest {

    @Test
    public void appendTextTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        element.appendText("Hello, World");
        assertEquals("Hello, World", element.text());
    }

}