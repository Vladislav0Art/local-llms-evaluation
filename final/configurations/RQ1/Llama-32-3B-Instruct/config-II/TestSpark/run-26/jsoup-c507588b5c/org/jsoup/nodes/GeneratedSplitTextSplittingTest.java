package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitTextSplittingTest {

    @Test
    public void splitTextSplittingTest() {
        String originalText = "original text";
        int offset = 5;
        TextNode node = new TextNode(originalText);
        node.splitText(offset);
        String expectedHead = "expected head";
        String expectedTail = "expected tail";
        assertEquals(expectedHead, node.getWholeText().substring(0, offset));
        assertEquals(expectedTail, node.getWholeText().substring(offset));
    }

}