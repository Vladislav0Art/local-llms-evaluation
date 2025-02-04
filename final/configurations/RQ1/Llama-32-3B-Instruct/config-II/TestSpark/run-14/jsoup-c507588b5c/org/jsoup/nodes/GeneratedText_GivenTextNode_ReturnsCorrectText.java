package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedText_GivenTextNode_ReturnsCorrectText {

    @Test
    public void text_GivenTextNode_ReturnsCorrectText() {
        String rawText = "   Hello,   World!  ";
        TextNode textNode = new TextNode(rawText);
        String expectedText = "Hello, World!";
        assertEquals(expectedText, textNode.text());
    }

}