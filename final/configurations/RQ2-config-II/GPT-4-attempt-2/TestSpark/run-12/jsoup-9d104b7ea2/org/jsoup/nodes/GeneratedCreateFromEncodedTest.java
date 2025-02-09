package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode tn = TextNode.createFromEncoded("test&amp;text");
        assertEquals("test&text", tn.getWholeText());
    }

}