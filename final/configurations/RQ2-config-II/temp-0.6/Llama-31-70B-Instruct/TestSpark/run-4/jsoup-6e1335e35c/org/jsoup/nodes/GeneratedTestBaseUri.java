package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBaseUri {

    @Test
    public void testBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        assertEquals("http://example.com/", element.baseUri());
    }

}