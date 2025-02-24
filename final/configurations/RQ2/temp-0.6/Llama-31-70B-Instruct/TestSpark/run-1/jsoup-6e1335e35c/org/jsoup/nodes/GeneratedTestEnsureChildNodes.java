package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestEnsureChildNodes {

    @Test
    public void testEnsureChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.ensureChildNodes().size(), 0);
    }

}