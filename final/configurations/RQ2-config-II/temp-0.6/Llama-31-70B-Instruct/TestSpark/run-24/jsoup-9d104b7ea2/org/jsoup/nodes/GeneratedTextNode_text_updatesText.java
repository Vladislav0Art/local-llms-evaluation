package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextNode_text_updatesText {

    @Test
    public void TextNode_text_updatesText() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}