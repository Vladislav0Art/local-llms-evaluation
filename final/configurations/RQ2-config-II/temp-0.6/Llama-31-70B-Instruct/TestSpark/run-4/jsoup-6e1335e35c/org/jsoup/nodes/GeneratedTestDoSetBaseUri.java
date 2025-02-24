package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestDoSetBaseUri {

    @Test
    public void testDoSetBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        element.doSetBaseUri("http://example.com/");
        assertEquals("http://example.com/", element.baseUri());
    }

}