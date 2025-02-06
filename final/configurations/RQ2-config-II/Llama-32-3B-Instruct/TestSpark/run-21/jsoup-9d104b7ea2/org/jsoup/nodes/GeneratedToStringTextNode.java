package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringTextNode {

    @Test
    public void toStringTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("TextNode [text=Hello, World!]", textNode.toString());
    }

}