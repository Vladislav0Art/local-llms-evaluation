package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("p");
        element.tagName("div");
        assertEquals("div", element.tagName());
    }

}