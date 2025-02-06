package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_ReturnsFalseWhenTextNodeTextIsNotEmpty {

    @Test
    public void isBlank_ReturnsFalseWhenTextNodeTextIsNotEmpty() {
        TextNode textNode = new TextNode("Hello, World!");
        assertFalse(textNode.isBlank());
    }

}