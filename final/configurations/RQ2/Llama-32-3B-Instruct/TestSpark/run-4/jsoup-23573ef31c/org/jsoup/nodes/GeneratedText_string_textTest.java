package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedText_string_textTest {

    @Test
    public void text_string_textTest() {
        Document document = new Document("https://example.com");
        String text = "Hello World!";
        Element element = document.text(text);
        assertNotNull(element);
    }

}