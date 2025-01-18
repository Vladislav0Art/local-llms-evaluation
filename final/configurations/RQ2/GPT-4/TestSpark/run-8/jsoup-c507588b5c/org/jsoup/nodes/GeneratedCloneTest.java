package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Testing");
        TextNode cloneNode = textNode.clone();
        assertNotSame(textNode, cloneNode);
        assertEquals(textNode.text(), cloneNode.text());
    }

}