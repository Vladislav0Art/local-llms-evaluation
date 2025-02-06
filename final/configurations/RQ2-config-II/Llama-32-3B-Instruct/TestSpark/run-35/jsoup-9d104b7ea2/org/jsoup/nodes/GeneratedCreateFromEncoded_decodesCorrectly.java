package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_decodesCorrectly {

    @Test
    public void createFromEncoded_decodesCorrectly() throws IOException {
        String encodedText = "Hello%2C+World%21";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", node.text());
    }

}