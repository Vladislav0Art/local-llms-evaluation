package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextMethodReturnsCorrectValueTest {

    public Document createDocument(String html) {
        return new org.jsoup.nodes.Document.Builder().html(html).build();
    }

    @Test
    public void textMethodReturnsCorrectValueTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}