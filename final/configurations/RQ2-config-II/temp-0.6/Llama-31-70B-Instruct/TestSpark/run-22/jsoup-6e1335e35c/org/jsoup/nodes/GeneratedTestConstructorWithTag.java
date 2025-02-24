package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTestConstructorWithTag {

    @Test
    public void testConstructorWithTag() {
        Element element = new Element(Tag.valueOf("div"));
        assertEquals("div", element.tagName());
        assertEquals("", element.baseUri());
    }

}