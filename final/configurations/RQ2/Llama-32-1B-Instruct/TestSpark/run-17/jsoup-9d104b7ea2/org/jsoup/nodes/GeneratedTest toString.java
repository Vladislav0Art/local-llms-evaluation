package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest toString {

    private String testText = "Hello World";
    private String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void test

    toString() {
        String result = "TextNode { text = Hello World }";
        assertEquals(result, document.toString());
    }

    @Before
    public void setupMockDocument() {
        document = new Document();
    }

}