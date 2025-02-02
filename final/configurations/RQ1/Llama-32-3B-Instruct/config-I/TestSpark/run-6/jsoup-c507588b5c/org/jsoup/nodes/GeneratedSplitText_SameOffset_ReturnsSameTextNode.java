package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedSplitText_SameOffset_ReturnsSameTextNode {

    @Test
    public void splitText_SameOffset_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(textNode.text().length());
        assertEquals(textNode, result);
    }

}