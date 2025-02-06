package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateElement_element_test {

    @Test
    public void createElement_element_test() {
        Document document = Document.createShell("http://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
        assertTrue(element instanceof Element);
    }

}