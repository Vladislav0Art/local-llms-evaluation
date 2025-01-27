package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedCreateElementCreatesNewElementCorrectly {

    @Test
    public void createElementCreatesNewElementCorrectly() {
        String tagName = "div";
        Element elem = new Document().createElement(tagName);
        assertNotNull(elem);
        assertEquals(tagName, elem.nodeName());
    }

}