package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeSplitTextTestsOffsetRangeValidation {

    @Test
    public void textNodeSplitTextTestsOffsetRangeValidation() {
        TextNode textNode = new TextNode("Hello World");

        when(textNode.coreValue()).thenReturn("Hello World");

        assertFalse(textNode.splitText(-1).isBlank());

        assertTrue(textNode.splitText(13).isBlank());
    }

}