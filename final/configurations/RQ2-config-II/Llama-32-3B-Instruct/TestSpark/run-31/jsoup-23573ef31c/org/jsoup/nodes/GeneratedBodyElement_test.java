package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBodyElement_test {

    @Test
    public void bodyElement_test() {
        Document document = Document.createShell("http://example.com");
        Element body = document.body();
        assertNotNull(body);
        assertTrue(body instanceof Element);
    }

}