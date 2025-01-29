package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddClass {

    private Document document = new Document();

    @Test
    public void testAddClass() {
        Element element = document.addClass("other");
        assertEquals("other", element.className());
        assertEquals("", element.val());
        assertEquals(null, element.html(""));
    }

}