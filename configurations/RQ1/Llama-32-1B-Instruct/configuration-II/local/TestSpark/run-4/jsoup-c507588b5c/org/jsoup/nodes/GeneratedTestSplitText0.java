package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText0 {

    @Test
    public void testSplitText0() {
        TextNode textNode = new TextNode("Hello\nWorld!");
        TextNode result = textNode.splitText(0);
        assertEquals(result, new TextNode(""));
    }

}