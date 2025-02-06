package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_textMethodSetsCorrectTextContent {

    @Test
    public void text_textMethodSetsCorrectTextContent() {
        String expectedText = "New Text Content";
        Document document = Document.createShell("https://www.example.com");
        document.text(expectedText);
        assertEquals(expectedText, document.text());
    }

}