package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode cloneNode = textNode.clone();
        assertNotNull(cloneNode);
        assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

}