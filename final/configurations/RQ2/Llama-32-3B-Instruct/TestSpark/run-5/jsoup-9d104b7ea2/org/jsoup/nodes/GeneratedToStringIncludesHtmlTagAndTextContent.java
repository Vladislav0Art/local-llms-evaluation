package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedToStringIncludesHtmlTagAndTextContent {

    @Test
    public void toStringIncludesHtmlTagAndTextContent() {
        String expectedOutput = "<node>text</node>";
        TextNode node = new TextNode("text");
        assertEquals(expectedOutput, node.toString());
    }

}