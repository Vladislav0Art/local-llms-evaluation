package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element element = new Element("tag");
        assertFalse(element.hasChildNodes());
    }

}