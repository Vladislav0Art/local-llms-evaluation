package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAttributes {

    @Test
    public void testAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertNotNull(element.attributes());
    }

}