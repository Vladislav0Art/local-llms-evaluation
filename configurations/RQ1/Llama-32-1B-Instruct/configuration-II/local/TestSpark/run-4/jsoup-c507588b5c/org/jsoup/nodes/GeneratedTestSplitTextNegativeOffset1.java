package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitTextNegativeOffset1 {

    @Test
    public void testSplitTextNegativeOffset1() throws IOException {
        TextNode textNode = new TextNode("Hello\nWorld!");
        TextNode result = textNode.splitText(-2);
        assertTrue(result.isBlank());
    }

}