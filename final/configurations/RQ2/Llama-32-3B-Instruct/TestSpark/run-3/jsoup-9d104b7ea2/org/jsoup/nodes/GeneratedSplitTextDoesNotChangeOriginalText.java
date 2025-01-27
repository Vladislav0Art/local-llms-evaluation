package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedSplitTextDoesNotChangeOriginalText {

    @Test
    public void splitTextDoesNotChangeOriginalText() throws IOException {
        StringBuilder originalStringBuilder = new StringBuilder("Hello World");
        TextNode node = new TextNode(originalStringBuilder.toString());
        TextNode clonedNode = node.splitText(5);
        assertEquals(originalStringBuilder, clonedNode.text());
    }

}