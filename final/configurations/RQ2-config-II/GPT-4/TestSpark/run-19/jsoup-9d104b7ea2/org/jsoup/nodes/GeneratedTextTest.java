package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "Hello, World!";
        TextNode tn = new TextNode("");
        tn.text(text);
        assertEquals(text, tn.text());
    }

}