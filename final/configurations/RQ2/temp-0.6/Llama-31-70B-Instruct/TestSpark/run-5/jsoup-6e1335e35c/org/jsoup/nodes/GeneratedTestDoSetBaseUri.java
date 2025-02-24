package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestDoSetBaseUri {

    private Element element;

    @BeforeEach
    public void setUp() {
        element = new Element("div");
    }

    @Test
    public void testDoSetBaseUri() {
        element.doSetBaseUri("http://example.com");
        assertEquals("http://example.com", element.baseUri());
    }

}