package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedSplitText_SplitsCorrectly AtOffset {

    @Test
    public void splitText_SplitsCorrectly

    AtOffset() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(7, tailNode.text().length());
    }

}