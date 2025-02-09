package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedText_SetTextReturnsString {

    @Test
    public void text_SetTextReturnsString() {
        Document document = new Document("https://www.example.com");
        String text = document.text("Hello World");
        assertEquals("Hello World", text);
    }

}