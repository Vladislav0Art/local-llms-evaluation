package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        TextNode cloned = textNode.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }

}