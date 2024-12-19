package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedCreateTextNodeFromEncoded_GivenEncodedText_ReturnsTextNode {

    private static final String TEST_TEXT = "Hello World";
    private static final int OFFSET = 7;
    private static final String NORMALISED_TEXT = "Hello World";

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsTextNode() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello&gt; World");
        assertEquals(TEST_TEXT, textNode.text());
    }

}