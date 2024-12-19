package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedClone_ClonedText_ReturnsCorrectClonedText {

    @Test
    public void clone_ClonedText_ReturnsCorrectClonedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(text, clonedTextNode.text());
    }

}