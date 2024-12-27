package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedIsBlank_NoWhitespace_ReturnsFalse {

    @Test
    public void isBlank_NoWhitespace_ReturnsFalse() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}