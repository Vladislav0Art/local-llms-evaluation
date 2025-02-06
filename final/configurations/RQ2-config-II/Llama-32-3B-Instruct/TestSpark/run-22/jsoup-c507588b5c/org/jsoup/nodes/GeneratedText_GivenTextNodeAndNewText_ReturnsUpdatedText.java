package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_GivenTextNodeAndNewText_ReturnsUpdatedText {

    @Test
    public void text_GivenTextNodeAndNewText_ReturnsUpdatedText() {
        TextNode node = new TextNode("Hello World");
        String newText = "Hello Universe";
        TextNode updatedNode = node.text(newText);
        assertEquals(newText, updatedNode.text());
    }

}