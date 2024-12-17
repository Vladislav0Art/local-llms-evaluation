package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedCreateFromEncoded Test {

    @Test
    public void createFromEncoded

    Test() {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello", textNode.text());
    }

}