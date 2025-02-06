package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_setsTextOnNode {

    @Test
    public void text_setsTextOnNode() {
        String originalText = "Hello";
        TextNode node = new TextNode(originalText);
        String newText = "New Hello";
        node.text(newText);
        assertEquals(newText, node.text());
    }

}