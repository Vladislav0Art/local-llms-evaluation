package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedCreateFromEncodedReturnsTextNodeWithUnencodedDataTest {

    @Test
    public void createFromEncodedReturnsTextNodeWithUnencodedDataTest() {
        String encodedText = "&lt;test&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node.text());
        assertEquals(encodedText, node.getWholeText().replace("&lt;", "<").replace("&gt;", ">"));
    }

}