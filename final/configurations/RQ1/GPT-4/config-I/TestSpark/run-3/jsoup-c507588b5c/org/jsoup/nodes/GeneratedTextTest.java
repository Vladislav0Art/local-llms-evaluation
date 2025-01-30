package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode tn = new TextNode("   test   ");
        assertEquals("test", tn.text());
        tn.text("another text");
        assertEquals("another text", tn.text());
    }

}