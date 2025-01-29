package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedLastCharIsWhitespace_test {

    @Test
    public void lastCharIsWhitespace_test() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder()));
        assertFalse(TextNode.lastCharIsWhitespace("Hello World"));
    }

}