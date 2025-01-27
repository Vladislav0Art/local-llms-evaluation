package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitTextPositiveOffsetNotNull {

    @Test
    public void splitTextPositiveOffsetNotNull() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(0);
        assertNotNull(result.text());
    }

}