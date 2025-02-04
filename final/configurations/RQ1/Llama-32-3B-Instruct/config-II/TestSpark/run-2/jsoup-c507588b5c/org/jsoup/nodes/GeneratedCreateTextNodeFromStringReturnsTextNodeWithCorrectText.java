package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTextNodeFromStringReturnsTextNodeWithCorrectText {

    @Test
    public void createTextNodeFromStringReturnsTextNodeWithCorrectText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}