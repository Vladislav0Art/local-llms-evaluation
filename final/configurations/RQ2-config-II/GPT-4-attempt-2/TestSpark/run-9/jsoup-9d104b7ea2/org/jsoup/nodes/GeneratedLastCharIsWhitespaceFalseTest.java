package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("no trailing space"));
        assertFalse(result);
    }

}