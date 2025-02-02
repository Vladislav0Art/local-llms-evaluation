package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_setsTextContent {

    @Test
    public void text_setsTextContent() {
        String text = "New Hello World!";
        TextNode textNode = new TextNode();
        textNode.text(text);
        assertEquals("New Hello World!", textNode.text());
    }

}