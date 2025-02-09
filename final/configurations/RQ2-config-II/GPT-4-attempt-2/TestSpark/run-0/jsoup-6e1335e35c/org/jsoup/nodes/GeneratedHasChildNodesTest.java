package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        assertTrue(parent.hasChildNodes());
    }

}