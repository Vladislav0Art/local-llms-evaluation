package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element elem = new Element("div");
        assertFalse(elem.hasChildNodes());
        elem.appendElement("span");
        assertTrue(elem.hasChildNodes());
    }

}