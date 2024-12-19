package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeSplitTextTestsOffsetValidation {

    @Test
    public void textNodeSplitTextTestsOffsetValidation() {
        TextNode textNode = new TextNode("Hello World");

        when(textNode.coreValue()).thenReturn("Hello World");

        assertFalse(textNode.splitText(0).isBlank());

        assertTrue(textNode.splitText(10).isBlank());
    }

}