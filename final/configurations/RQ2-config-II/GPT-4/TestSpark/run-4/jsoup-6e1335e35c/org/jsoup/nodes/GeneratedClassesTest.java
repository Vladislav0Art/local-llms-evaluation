package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedClassesTest {

    @Test
    public void classesTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        element.addClass("test");
        assertTrue(element.hasClass("test"));
        element.removeClass("test");
        assertFalse(element.hasClass("test"));
    }

}