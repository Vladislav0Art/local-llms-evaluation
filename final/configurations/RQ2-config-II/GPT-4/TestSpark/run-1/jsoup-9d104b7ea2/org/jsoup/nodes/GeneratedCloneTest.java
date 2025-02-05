package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "example text";
        TextNode textNode = new TextNode(text);
        TextNode clonedNode = textNode.clone();

        assertEquals(textNode.text(), clonedNode.text());
    }

}