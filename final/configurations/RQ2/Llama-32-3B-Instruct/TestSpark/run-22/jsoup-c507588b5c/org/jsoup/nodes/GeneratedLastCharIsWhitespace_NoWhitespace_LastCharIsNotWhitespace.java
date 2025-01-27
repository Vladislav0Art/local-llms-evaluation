package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedLastCharIsWhitespace_NoWhitespace_LastCharIsNotWhitespace {

    @Test
    public void lastCharIsWhitespace_NoWhitespace_LastCharIsNotWhitespace() {
        StringBuilder sb = new StringBuilder("test");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}