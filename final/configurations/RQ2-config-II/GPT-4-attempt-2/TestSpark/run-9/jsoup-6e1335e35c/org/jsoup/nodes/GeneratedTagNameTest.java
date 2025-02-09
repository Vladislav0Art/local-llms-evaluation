package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

}