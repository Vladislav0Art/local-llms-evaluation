package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextNode_isBlank_returnsTrueForEmptyText {

    @Test
    public void TextNode_isBlank_returnsTrueForEmptyText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}