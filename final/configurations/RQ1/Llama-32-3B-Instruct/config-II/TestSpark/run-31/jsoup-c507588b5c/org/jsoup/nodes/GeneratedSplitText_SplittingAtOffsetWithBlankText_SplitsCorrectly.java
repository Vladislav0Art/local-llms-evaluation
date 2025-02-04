package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitText_SplittingAtOffsetWithBlankText_SplitsCorrectly {

    @Test
    public void splitText_SplittingAtOffsetWithBlankText_SplitsCorrectly() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 6;
        TextNode newText = textNode.splitText(offset);
        assertEquals(1, newText.nodeName());
        assertEquals("", newText.text());
    }

}