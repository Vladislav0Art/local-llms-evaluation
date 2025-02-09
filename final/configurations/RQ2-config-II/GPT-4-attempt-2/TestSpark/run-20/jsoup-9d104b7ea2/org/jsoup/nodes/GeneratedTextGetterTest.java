package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextGetterTest {

    @Test
    public void textGetterTest() {
        TextNode tn = new TextNode("Hello");
        assertEquals("Hello", tn.text());
    }

}