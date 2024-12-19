package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeTextReturnsCorrectValueTest {

    public Document createDocument(String html) {
        return new org.jsoup.nodes.Document.Builder().html(html).build();
    }

    @Test
    public void getWholeTextReturnsCorrectValueTest() {
        TextNode textNode = new TextNode("Hello World\nThis is a test");
        assertEquals("Hello World\nThis is a test", textNode.getWholeText());
    }

}