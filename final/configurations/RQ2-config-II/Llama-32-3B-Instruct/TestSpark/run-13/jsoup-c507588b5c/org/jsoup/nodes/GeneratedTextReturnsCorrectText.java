package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextReturnsCorrectText {

    @Test
    public void textReturnsCorrectText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}