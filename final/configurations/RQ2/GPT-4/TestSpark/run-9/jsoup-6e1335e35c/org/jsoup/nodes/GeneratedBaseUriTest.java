package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element elem = new Element(Tag.valueOf("div"), "https://example.com", null);
        assertEquals("https://example.com", elem.baseUri());
    }

}