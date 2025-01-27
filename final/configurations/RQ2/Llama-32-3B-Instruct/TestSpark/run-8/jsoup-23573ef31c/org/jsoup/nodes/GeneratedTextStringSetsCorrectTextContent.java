package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTextStringSetsCorrectTextContent {

    @Test
    public void textStringSetsCorrectTextContent() {
        String text = "Hello World!";
        Element element = new Element();
        Document document = new Document("http://example.com");
        Element result = document.text(text);
        assertNotNull(result);
        assertEquals(text, result.text());
    }

}