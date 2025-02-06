package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneTextNode {

    @Test
    public void cloneTextNode() throws IOException {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode.text(), clonedTextNode.text());
    }

}