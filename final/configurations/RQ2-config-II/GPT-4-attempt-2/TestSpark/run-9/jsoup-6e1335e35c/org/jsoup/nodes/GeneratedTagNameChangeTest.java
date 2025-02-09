package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedTagNameChangeTest {

    @Test
    public void tagNameChangeTest() {
        Element element = new Element("p");
        assertEquals("p", element.tagName());
        element.tagName("div");
        assertEquals("div", element.tagName());
    }

}