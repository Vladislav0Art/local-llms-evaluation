package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedText_textReturned {

    @Test
    public void text_textReturned() {
        String text = "Hello World";
        Document document = Document.createShell(text);
        assertEquals(text, document.text());
    }

}