package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("sample text");
        textNode.text("updated text");
        assertEquals("updated text", textNode.text());
    }

}