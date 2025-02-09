package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementCssSelectorTest {

    @Test
    public void ElementCssSelectorTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.addClass("myClass");
        assertEquals("div.myClass", element.cssSelector());
    }

}