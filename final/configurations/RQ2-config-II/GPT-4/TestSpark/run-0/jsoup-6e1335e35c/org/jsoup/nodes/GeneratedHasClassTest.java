package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("class", "test");

        assertTrue(element.hasClass("test"));
        assertFalse(element.hasClass("another"));
    }

}