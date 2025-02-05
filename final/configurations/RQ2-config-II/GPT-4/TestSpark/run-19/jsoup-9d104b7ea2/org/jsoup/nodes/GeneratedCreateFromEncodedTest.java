package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encoded = "Hello%2C+World%21";
        TextNode tn = TextNode.createFromEncoded(encoded, false);
        assertEquals("Hello, World!", tn.text());
    }

}