package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeSplitTextTestsSplittingSuccess {

    @Test
    public void textNodeSplitTextTestsSplittingSuccess() {
        // Given a new TextNode to be split
        TextNode textNode = new TextNode("Hello World");

        when(textNode.coreValue()).thenReturn("Hello World");

        TextNode leftTextNode = textNode.splitText(5);

        assertEquals("Hello", leftTextNode.text());

        TextNode rightTextNode = textNode.splitText(0).splitText(6);

        assertEquals("World", rightTextNode.text());
    }

}