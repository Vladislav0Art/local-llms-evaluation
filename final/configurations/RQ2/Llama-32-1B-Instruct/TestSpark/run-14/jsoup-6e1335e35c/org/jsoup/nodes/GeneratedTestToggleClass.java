package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestToggleClass {

    private Document document = new Document();

    @Test
    public void testToggleClass() {
        Element element = document.toggleClass("other");
        assertEquals("other", element.className());
        assertEquals("test", element.className());
        assertEquals("", element.val());
        assertEquals(null, element.html(""));
    }

}