package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementTagNameTest {

    @Test
    public void ElementTagNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

}