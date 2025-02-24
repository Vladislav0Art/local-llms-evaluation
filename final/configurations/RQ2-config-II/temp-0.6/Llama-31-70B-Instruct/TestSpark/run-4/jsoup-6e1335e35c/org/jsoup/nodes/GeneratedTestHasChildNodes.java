package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestHasChildNodes {

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        assertFalse(element.hasChildNodes());
    }

}