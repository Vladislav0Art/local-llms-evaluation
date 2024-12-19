package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText1 {

    @Test
    public void testSplitText1() {
        String text = "Hello\nWorld!";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(2);
        assertEquals(result, new TextNode("Hello"));
    }

}