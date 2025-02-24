package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAttributes {

    @Test
    public void testAttributes() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        assertNotNull(element.attributes());
    }

}