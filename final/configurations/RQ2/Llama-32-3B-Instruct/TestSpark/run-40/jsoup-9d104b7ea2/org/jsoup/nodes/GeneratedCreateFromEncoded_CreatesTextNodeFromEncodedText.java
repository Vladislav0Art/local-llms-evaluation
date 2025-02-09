package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedCreateFromEncoded_CreatesTextNodeFromEncodedText {

    @Test
    public void createFromEncoded_CreatesTextNodeFromEncodedText() throws Exception {
        String encodedText = "text";
        TextNode node = new TextNode(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}