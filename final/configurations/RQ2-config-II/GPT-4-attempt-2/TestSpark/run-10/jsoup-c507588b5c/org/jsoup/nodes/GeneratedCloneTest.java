package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode.text(), clonedTextNode.text());
        assertNotEquals(textNode, clonedTextNode);
    }

}