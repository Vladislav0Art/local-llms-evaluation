package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedText_setsAndGetsCorrectTextContent {

    @Test
    public void text_setsAndGetsCorrectTextContent() {
        String text = "Example Text";
        Document document = new Document("https://example.com");
        Element element = document.text(text);
        assertNotNull(element);
        assertEquals(text, element.data());
    }

}