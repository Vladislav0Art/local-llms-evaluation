package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode tn = new TextNode("sample text");
        tn.text("new sample text");
        assertEquals("new sample text", tn.text());
    }

}