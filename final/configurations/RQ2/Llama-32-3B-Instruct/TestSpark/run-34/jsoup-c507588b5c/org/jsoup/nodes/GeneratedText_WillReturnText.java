package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedText_WillReturnText {

    @Test
    public void text_WillReturnText() {
        TextNode node = new TextNode("text");
        assertEquals("text", node.text());
    }

}