package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedText_EmptyTextNode_ReturnsEmptyString {

    @Test
    public void text_EmptyTextNode_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}