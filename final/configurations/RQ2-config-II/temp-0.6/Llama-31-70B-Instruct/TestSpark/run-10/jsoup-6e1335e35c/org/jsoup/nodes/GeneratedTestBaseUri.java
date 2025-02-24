package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestBaseUri {

    @Test
    public void testBaseUri() {
        Element element = new Element("div");
        assertNull(element.baseUri());
        element.setBaseUri("https://example.com");
        assertEquals("https://example.com", element.baseUri());
    }

}