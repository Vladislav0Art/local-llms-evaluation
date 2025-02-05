package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasChildNodes());

        element.appendChild(new Element(Tag.valueOf("p"), ""));
        assertTrue(element.hasChildNodes());
    }

}