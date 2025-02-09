package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloneNode = textNode.clone();
        assertEquals(textNode.text(), cloneNode.text());
        assertNotSame(textNode, cloneNode);
    }

}