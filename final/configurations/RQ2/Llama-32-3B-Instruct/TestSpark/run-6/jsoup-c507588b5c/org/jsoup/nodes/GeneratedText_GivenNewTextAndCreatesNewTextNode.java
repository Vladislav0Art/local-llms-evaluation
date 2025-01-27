package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedText_GivenNewTextAndCreatesNewTextNode {

    @Test
    public void text_GivenNewTextAndCreatesNewTextNode() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        String newText = "Hello World!";
        TextNode newTextNode = new TextNode(newText);
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}