package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode node = new TextNode("test");
        StringBuilder stringBuilder = new StringBuilder();
        node.outerHtmlHead(stringBuilder, 0, new Document("").outputSettings());
        assertEquals("test", stringBuilder.toString());
    }

}