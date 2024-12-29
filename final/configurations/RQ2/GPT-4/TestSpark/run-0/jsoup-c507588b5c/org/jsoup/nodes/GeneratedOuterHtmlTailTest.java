package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("");
        StringBuilder stringBuilder = new StringBuilder();
        node.outerHtmlTail(stringBuilder, 0, new Document("").outputSettings());
        assertEquals("", stringBuilder.toString());
    }

}