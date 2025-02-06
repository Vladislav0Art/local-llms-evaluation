package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtml_outerHtmlMethodReturnsCorrectString {

    @Test
    public void outerHtml_outerHtmlMethodReturnsCorrectString() {
        String expectedOuterHtml = "<html><body>Hello World!</body></html>";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedOuterHtml, document.outerHtml());
    }

}