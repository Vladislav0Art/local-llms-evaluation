package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDoSetBaseUriTest {

    @Test
    public void doSetBaseUriTest() {
        Element elem = new Element("div");
        elem.doSetBaseUri("https://example.com");
        assertEquals("https://example.com", elem.baseUri());
    }

}