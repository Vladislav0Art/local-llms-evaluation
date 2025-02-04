package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedSplitText_GivenTextNodeAtOffset_ReturnsCorrectSplitTextNode {

    @Test
    public void splitText_GivenTextNodeAtOffset_ReturnsCorrectSplitTextNode() throws IOException {
        String text = "Hello World\nThis is a test";
        int offset = 5;
        List<String> originalText = new ArrayList<>(List.of("Hello", "World"));
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(offset);
        assertEquals(originalText, StringUtil.normaliseWhitespace(splitTextNode.getWholeText()));
    }

}