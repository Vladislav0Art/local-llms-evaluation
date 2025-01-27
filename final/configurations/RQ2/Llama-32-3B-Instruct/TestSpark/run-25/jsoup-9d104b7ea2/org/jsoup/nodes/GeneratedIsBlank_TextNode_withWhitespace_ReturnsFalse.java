package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_TextNode_withWhitespace_ReturnsFalse {

    @Test
    public void isBlank_TextNode_withWhitespace_ReturnsFalse() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}