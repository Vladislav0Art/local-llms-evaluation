package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class GeneratedSplit_text {

    @Test
    public void split_text() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode tailNode = node.splitText(10);
        assertNotNull(tailNode);
        assertEquals("Hello", tailNode.text());
    }

}