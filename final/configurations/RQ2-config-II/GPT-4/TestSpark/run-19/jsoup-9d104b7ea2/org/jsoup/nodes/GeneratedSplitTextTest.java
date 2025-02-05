package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Hello, World!";
        TextNode tn = new TextNode(text);
        TextNode tn2 = tn.splitText(6);
        assertEquals("Hello,", tn.text());
        assertEquals(" World!", tn2.text());
    }

}