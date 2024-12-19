package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTextSetting Test {

    @Test
    public void textSetting

    Test() {
        String text = "Hello";
        TextNode textNode = new TextNode();
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

}