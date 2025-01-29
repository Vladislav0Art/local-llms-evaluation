package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRemoveClass {

    private Document document = new Document();

    @Test
    public void testRemoveClass() {
        Element element = document.removeClass("test");
        assertEquals("test", element.className());
        assertEquals("", element.val());
        assertEquals(null, element.html(""));
    }

}