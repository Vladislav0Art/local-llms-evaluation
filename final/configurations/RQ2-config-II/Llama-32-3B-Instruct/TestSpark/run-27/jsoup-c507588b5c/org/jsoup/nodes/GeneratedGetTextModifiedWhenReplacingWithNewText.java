package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetTextModifiedWhenReplacingWithNewText {

    @Test
    public void getTextModifiedWhenReplacingWithNewText() {
        TextNode textNode = new TextNode("initial");
        TextNode newText = new TextNode("new");
        textNode.text(newText.text());
        assertEquals(newText.text(), textNode.text());
    }

}