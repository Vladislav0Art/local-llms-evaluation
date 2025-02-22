package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText2 {

    @Test
    public void testText2() {
        String text = "test";
        TextNode textNode = new TextNode(text);
        textNode.text(text);
        String newText = textNode.text();
        assertEquals(text, newText);
    }

}