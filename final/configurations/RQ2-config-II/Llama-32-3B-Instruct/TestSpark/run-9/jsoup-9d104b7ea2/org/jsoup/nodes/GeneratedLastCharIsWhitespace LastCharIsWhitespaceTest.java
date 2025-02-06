package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedLastCharIsWhitespace LastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespace

    LastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Hello");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

}