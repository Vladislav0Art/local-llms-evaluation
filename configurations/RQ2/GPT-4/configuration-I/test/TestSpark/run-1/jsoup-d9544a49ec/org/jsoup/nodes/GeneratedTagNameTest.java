package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("tag");
        assertEquals("tag", element.tagName());
    }

}