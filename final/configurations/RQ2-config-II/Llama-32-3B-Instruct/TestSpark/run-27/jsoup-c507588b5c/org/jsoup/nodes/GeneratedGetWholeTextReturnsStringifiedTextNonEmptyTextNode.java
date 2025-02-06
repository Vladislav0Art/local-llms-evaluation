package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextReturnsStringifiedTextNonEmptyTextNode {

    @Test
    public void getWholeTextReturnsStringifiedTextNonEmptyTextNode() {
        String text = "not empty";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}