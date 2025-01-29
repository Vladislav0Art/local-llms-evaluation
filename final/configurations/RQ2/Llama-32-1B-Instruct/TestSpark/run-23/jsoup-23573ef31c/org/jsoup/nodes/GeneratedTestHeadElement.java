package org.jsoup.nodes;

public class GeneratedTestHeadElement {

    @Test
    public void testHeadElement() {
        Element head = document.head();
        assertNotNull(head);
        assertEquals("<!DOCTYPE html>", head.outerHtml());
    }

}