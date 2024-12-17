package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedText_TextChanged_SameTextRetured {

    @Test
    public void text_TextChanged_SameTextRetured() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        assertEquals(text, textNode.text());
    }

}