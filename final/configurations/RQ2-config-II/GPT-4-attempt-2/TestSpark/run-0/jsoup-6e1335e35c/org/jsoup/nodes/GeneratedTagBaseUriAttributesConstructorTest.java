package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagBaseUriAttributesConstructorTest {

    @Test
    public void tagBaseUriAttributesConstructorTest() {
        Tag tag = Tag.valueOf("div");
        Element element = new Element(tag, "http://example.com/", null);
        assertEquals("div", element.tagName());
        assertEquals("http://example.com/", element.baseUri());
    }

}