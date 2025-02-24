package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("text");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}