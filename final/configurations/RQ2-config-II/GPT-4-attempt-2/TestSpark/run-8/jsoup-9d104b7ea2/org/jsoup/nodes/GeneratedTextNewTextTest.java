package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTextNewTextTest {

    @Test
    public void textNewTextTest() {
        String text = "Test text";
        String newText = "New Test text";
        TextNode textNode = new TextNode(text);
        textNode = textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}