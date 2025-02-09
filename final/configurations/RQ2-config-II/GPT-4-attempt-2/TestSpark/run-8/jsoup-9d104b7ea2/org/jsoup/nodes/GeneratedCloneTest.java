package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        TextNode cloneNode = textNode.clone();
        assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

}