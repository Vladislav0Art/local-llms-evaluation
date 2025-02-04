package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedIsBlank_GivenTextNodeWithText_ReturnsFalse {

    @Test
    public void isBlank_GivenTextNodeWithText_ReturnsFalse() {
        String rawText = "Hello, World!";
        TextNode textNode = new TextNode(rawText);
        assertFalse(textNode.isBlank());
    }

}