package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_returnsCorrectTextNode {

    @Test
    public void clone_returnsCorrectTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertEquals(textNode.coreValue(), clonedTextNode.coreValue());
    }

}