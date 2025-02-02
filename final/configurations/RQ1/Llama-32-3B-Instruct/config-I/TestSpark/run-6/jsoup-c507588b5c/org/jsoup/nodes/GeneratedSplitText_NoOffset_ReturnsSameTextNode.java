package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedSplitText_NoOffset_ReturnsSameTextNode {

    @Test
    public void splitText_NoOffset_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(0);
        assertEquals(textNode, result);
    }

}