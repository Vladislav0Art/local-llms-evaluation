package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_ReturnsNewTextNodeWithSameText {

    @Test
    public void clone_ReturnsNewTextNodeWithSameText() {
        String text = "Hello, World!";
        TextNode originalTextNode = new TextNode(text);
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(text, clonedTextNode.text());
    }

}