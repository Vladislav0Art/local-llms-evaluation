package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTagName {

    @Test
    public void testTagName() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.tagName(), "div");
    }

}