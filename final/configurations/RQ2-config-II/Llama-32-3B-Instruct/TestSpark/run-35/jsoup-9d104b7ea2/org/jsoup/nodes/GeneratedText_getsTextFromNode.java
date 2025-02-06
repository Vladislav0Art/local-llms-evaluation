package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_getsTextFromNode {

    @Test
    public void text_getsTextFromNode() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}