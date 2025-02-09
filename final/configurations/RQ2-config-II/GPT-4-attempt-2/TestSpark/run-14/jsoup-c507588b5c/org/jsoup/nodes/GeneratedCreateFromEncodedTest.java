package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("hello&amp;", false);
        assertEquals("hello&", textNode.getWholeText());
    }

}