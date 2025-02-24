package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestChildNodeSize {

    @Test
    public void testChildNodeSize() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.childNodeSize(), 0);
    }

}