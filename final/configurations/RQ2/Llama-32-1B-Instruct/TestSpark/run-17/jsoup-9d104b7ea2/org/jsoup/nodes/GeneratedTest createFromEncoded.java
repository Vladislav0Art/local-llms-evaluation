package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest createFromEncoded {

    private String testText = "Hello World";
    private String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void test

    createFromEncoded() {
        String encodedText = "Hello World";
        TextNode createdNode = org.jsoup.nodes.TextNode.createFromEncoded(encodedText);
        assertEquals(node, createdNode);
    }

}