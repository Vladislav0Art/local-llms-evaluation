package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_isText {

    @Test
    public void nodeName_isText() {
        String text = "Hello";
        TextNode node = new TextNode(text);
        assertEquals("text", node.nodeName());
    }

}