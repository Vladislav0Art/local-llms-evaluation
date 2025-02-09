package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test text");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode.text(), clonedTextNode.text());
    }

}