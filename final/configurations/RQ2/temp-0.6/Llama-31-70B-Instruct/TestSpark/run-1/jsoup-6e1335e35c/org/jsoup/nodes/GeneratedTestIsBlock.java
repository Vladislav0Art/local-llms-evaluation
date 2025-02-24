package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertTrue(element.isBlock());
    }

}