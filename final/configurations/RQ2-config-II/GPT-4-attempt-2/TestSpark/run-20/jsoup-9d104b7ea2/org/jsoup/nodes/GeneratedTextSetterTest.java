package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode tn = new TextNode("Hello");
        tn.text("World");
        assertEquals("World", tn.text());
    }

}