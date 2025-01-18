package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorWithTagNameTest {

    @Test
    public void constructorWithTagNameTest() {
        Element element = new Element("div");
        assertNotNull(element);
        assertEquals("div", element.tagName());
    }

}