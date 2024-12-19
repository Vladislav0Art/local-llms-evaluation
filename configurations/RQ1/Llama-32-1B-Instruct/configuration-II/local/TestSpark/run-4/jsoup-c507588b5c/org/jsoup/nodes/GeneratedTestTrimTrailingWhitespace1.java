package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTrimTrailingWhitespace1 {

    @Test
    public void testTrimTrailingWhitespace1() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}