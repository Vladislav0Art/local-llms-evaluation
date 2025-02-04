package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

public class GeneratedCloneTest {

    @Test
    public void CloneTest() throws CloneNotSupportedException {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode clonedTextNode = (TextNode) originalTextNode.clone();

        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.nodeName(), clonedTextNode.nodeName());
        assertEquals(originalTextNode.text(), clonedTextNode.text());
    }

}