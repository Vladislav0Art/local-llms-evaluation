package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedSplitText_GivenInvalidOffset_ReturnsIncorrectSplitTextNode {

    @Test
    public void splitText_GivenInvalidOffset_ReturnsIncorrectSplitTextNode() throws IOException {
        String text = "Hello World";
        int offset = 5;
        List<String> originalText = new ArrayList<>(List.of("Hello", "World"));
        TextNode textNode = new TextNode(text);
        try {
            textNode.splitText(offset);
            assert false;
        } catch (IllegalArgumentException e) {
            assertEquals("Split offset must be not be negative", e.getMessage());
        }
    }

}