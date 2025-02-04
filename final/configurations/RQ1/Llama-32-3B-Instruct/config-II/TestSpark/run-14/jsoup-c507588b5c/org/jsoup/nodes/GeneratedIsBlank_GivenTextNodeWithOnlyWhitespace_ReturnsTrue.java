package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedIsBlank_GivenTextNodeWithOnlyWhitespace_ReturnsTrue {

    @Test
    public void isBlank_GivenTextNodeWithOnlyWhitespace_ReturnsTrue() {
        String rawText = "   ";
        TextNode textNode = new TextNode(rawText);
        assertTrue(textNode.isBlank());
    }

}