package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("A");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}