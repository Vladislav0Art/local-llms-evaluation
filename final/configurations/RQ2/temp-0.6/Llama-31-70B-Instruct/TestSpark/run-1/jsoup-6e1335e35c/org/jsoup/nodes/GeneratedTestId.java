package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestId {

    @Test
    public void testId() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.id(), "");
    }

}