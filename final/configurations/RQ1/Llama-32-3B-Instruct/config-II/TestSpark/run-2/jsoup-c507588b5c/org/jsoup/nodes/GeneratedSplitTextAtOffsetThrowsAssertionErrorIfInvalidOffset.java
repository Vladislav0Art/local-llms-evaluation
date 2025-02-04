package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSplitTextAtOffsetThrowsAssertionErrorIfInvalidOffset {

    @Test
    public void splitTextAtOffsetThrowsAssertionErrorIfInvalidOffset() {
        String text = "Hello World";
        int offset = -1;
        TextNode node = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> node.splitText(offset));
    }

}