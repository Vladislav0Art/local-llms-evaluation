package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedCreateFromEncoded_EncodedTextReturnsTextNode {

    @Test
    public void createFromEncoded_EncodedTextReturnsTextNode() throws IOException {
        String encodedText = "text";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
    }

}