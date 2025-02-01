package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encoded = "Test &amp; String";
        TextNode textNode = TextNode.createFromEncoded(encoded);
        assertEquals("Test & String", textNode.getWholeText());
    }

}