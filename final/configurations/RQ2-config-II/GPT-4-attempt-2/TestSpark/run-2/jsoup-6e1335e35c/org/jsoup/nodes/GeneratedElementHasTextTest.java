package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementHasTextTest {

    @Test
    public void ElementHasTextTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.text("Hello");
        assertTrue(element.hasText());
    }

}