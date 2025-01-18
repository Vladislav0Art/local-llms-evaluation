package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element elem = new Element("div");
        elem.addClass("test");
        assertTrue(elem.hasClass("test"));
    }

}