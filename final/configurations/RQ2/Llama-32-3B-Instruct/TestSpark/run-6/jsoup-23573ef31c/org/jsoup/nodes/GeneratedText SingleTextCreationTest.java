package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedText SingleTextCreationTest {

    @Test
    public void text

    SingleTextCreationTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        String text = document.text("Hello World");
        assertEquals("Hello World", text);
    }

}