package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementToggleClassTest {

    @Test
    public void ElementToggleClassTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.toggleClass("test");
        assertTrue(element.hasClass("test"));
        element.toggleClass("test");
        assertFalse(element.hasClass("test"));
    }

}