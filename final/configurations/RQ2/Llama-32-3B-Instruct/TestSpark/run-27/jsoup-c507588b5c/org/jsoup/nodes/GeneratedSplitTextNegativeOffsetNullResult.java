package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitTextNegativeOffsetNullResult {

    @Test
    public void splitTextNegativeOffsetNullResult() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNull(textNode.splitText(-1).text());
    }

}