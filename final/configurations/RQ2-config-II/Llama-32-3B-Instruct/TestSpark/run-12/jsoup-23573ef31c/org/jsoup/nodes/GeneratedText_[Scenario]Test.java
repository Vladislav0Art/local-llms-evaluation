package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedText_[Scenario]

Test {

    @Test
    public void text_[ Scenario]Test() {
        Document document = Document.createShell("https://example.com");
        String text = document.text("Hello World!");
        assertEquals("Hello World!", text);
    }

}