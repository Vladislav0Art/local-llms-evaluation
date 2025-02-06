package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTextShouldSetText {

    @Test
    public void textShouldSetText() {
        String text = "test";
        Document document = new Document("http://example.com");
        Element element = Mockito.mock(Element.class);
        document.text(element, text);

        assertEquals(text, element.html());
    }

}