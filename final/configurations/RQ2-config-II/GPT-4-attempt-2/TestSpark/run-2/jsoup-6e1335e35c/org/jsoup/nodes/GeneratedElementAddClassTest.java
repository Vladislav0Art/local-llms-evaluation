package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementAddClassTest {

    @Test
    public void ElementAddClassTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.addClass("test");
        assertTrue(element.hasClass("test"));
    }

}