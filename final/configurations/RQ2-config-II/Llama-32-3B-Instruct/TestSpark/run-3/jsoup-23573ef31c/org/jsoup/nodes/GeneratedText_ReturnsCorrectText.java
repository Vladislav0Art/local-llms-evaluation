package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedText_ReturnsCorrectText {

    @Test
    public void text_ReturnsCorrectText() {
        String text = "Hello World!";
        Document document = new Document();
        Element element = document.text(text);
        assertNotNull(element);
        assertEquals(text, element.data());
    }

}