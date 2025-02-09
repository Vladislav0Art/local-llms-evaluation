package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagNameConstructorTest {

    @Test
    public void tagNameConstructorTest() {
        Element element = new Element("p");
        assertEquals("p", element.tagName());
    }

}