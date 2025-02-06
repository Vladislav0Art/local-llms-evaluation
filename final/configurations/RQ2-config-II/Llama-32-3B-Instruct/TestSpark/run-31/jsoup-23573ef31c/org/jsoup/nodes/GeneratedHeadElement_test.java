package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedHeadElement_test {

    @Test
    public void headElement_test() {
        Document document = Document.createShell("http://example.com");
        Element head = document.head();
        assertNotNull(head);
        assertTrue(head instanceof Element);
    }

}