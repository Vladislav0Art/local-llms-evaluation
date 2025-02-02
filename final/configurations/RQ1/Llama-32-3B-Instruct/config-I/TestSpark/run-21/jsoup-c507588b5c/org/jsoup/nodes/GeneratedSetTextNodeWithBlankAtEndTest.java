package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetTextNodeWithBlankAtEndTest {

    @Test
    public void setTextNodeWithBlankAtEndTest() throws IOException {
        String text = "Hello World   ";
        Document doc = new Document(text);
        TextNode textNode = doc.getNodes().get(0);
        assertTrue(textNode.isBlank());
        textNode.text("Hello World");
        assertFalse(textNode.isBlank());
    }

}