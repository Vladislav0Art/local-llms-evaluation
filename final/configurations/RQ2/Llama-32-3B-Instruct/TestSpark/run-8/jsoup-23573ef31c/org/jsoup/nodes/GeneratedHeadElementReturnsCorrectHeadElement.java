package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedHeadElementReturnsCorrectHeadElement {

    @Test
    public void headElementReturnsCorrectHeadElement() {
        Document document = new Document("http://example.com");
        Element headElement = document.head();
        assertNotNull(headElement);
        assertTrue(headElement.hasChild("title"));
    }

}