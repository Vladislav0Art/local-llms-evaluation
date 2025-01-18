package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorWithTagBaseUriAttributesTest {

    @Test
    public void constructorWithTagBaseUriAttributesTest() {
        Element element = new Element(Tag.valueOf("div"), "https://example.com", null);
        assertNotNull(element);
        assertEquals("div", element.tagName());
        assertEquals("https://example.com", element.baseUri());
    }

}