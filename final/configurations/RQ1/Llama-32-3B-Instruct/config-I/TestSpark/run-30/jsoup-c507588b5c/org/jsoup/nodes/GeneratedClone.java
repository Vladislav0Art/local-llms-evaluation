package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedClone {

    @Test
    public void clone() throws CloneNotSupportedException {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode clonedTextNode = (TextNode) originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.nodeName(), clonedTextNode.nodeName());
        assertEquals(originalTextNode.text(), clonedTextNode.text());
    }

}