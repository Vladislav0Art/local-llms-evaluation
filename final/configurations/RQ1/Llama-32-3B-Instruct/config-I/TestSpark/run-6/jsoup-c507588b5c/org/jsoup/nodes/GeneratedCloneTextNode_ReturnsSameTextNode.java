package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedCloneTextNode_ReturnsSameTextNode {

    @Test
    public void cloneTextNode_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }
}

}