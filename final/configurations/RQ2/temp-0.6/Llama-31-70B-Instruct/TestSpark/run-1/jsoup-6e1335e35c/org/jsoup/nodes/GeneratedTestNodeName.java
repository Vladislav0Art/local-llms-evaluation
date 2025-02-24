package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.nodeName(), "div");
    }

}