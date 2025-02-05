package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        element.html("<p>Hello, World</p>");
        assertEquals("<p>Hello, World</p>", element.html());
    }

}