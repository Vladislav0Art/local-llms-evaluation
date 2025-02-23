package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextNode_text_returnsNormalisedText {

    @Test
    public void TextNode_text_returnsNormalisedText() {
        TextNode textNode = new TextNode("  test  ");
        assertEquals("test", textNode.text());
    }

}