package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode tn = new TextNode("   Hello, World!  ");
        assertEquals("Hello, World!", tn.text());
        assertEquals("   Hello, World!  ", tn.getWholeText());

        tn.text("   Hi, World!  ");
        assertEquals("Hi, World!", tn.text());
        assertEquals("   Hi, World!  ", tn.getWholeText());
    }

}