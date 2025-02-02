package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateTextNodeWithTextTest {

    @Test
    public void createTextNodeWithTextTest() throws IOException {
        String text = "Hello World";
        Document doc = new Document(text);
        TextNode textNode = doc.getNodes().get(0);
        assertEquals("Hello World", textNode.text());
    }

}