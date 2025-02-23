package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextNode_isBlank_returnsFalseForNonEmptyText {

    @Test
    public void TextNode_isBlank_returnsFalseForNonEmptyText() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

}