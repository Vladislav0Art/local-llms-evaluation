package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedText {

    @Test
    public void text() {
        Document document = Jsoup.parse("<p>Hello World!</p>");
        Element element = new Tag();
        String text = "Hello World!";
        assertEquals(text, document.text(element));
    }

}