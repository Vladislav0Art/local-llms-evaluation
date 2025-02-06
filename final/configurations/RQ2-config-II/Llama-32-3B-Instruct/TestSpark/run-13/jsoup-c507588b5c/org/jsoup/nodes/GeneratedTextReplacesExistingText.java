package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextReplacesExistingText {

    @Test
    public void textReplacesExistingText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

}