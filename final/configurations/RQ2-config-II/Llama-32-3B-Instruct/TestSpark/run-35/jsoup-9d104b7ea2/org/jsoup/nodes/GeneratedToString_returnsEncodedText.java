package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToString_returnsEncodedText {

    @Test
    public void toString_returnsEncodedText() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello,World!", node.toString());
    }

}