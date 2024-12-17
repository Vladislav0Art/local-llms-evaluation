package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedGetWholeText Test {

    @Test
    public void getWholeText

    Test() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}