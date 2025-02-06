package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateTextNode_fromString {

    @Test
    public void createTextNode_fromString() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}