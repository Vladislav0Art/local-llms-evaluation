package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTextMethodSetsCorrectTextContent {

    @Test
    public void textMethodSetsCorrectTextContent() {
        String text = "Hello World!";
        Document document = new Document();
        document.text(text);
        assertEquals(text, document.text());
    }

}