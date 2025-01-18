package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasAttributesTest {

    @Test
    public void hasAttributesTest() {
        Element elem = new Element("div");
        assertFalse(elem.hasAttributes());
        elem.attr("attr", "value");
        assertTrue(elem.hasAttributes());
    }

}