package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlank_HaveText_ReturnsFalse {

    @Test
    public void isBlank_HaveText_ReturnsFalse() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}