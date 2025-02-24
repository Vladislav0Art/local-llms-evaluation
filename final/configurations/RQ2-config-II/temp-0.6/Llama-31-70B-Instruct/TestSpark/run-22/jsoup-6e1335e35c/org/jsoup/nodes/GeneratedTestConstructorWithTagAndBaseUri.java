package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTestConstructorWithTagAndBaseUri {

    @Test
    public void testConstructorWithTagAndBaseUri() {
        Element element = new Element(Tag.valueOf("a"), "http://example.com");
        assertEquals("a", element.tagName());
        assertEquals("http://example.com", element.baseUri());
    }

}