package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encoded = "sample text";
        TextNode node = TextNode.createFromEncoded(encoded);
        assertEquals("sample text", node.getWholeText());
    }

}