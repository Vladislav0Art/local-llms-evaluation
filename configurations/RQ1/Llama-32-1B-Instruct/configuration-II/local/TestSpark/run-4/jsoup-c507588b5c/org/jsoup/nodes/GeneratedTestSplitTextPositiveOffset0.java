package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitTextPositiveOffset0 {

    @Test
    public void testSplitTextPositiveOffset0() {
        String text = "Hello\nWorld!";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(4);
        assertEquals(new TextNode("Hello"), result);
    }

}