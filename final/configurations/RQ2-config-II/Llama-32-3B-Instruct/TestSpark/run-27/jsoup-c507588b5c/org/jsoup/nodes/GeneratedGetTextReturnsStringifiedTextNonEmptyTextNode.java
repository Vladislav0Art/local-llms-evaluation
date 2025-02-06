package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetTextReturnsStringifiedTextNonEmptyTextNode {

    @Test
    public void getTextReturnsStringifiedTextNonEmptyTextNode() {
        String text = "not empty";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}