package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneMethodTest {

    @Test
    public void cloneMethodTest() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        TextNode clonedTextNode = textNode.clone();

        assertEquals(textNode.text(), clonedTextNode.text());
    }

}