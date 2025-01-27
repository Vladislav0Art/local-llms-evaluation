package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBodyElementReturnsCorrectBodyElement {

    @Test
    public void bodyElementReturnsCorrectBodyElement() {
        Document document = new Document("http://example.com");
        Element bodyElement = document.body();
        assertNotNull(bodyElement);
        assertTrue(bodyElement.hasChild("html"));
    }

}