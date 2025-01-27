package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedLastCharIsWhitespace_WithWhitespace_LastCharIsWhitespace {

    @Test
    public void lastCharIsWhitespace_WithWhitespace_LastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder("test ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    private String accumulateToString(Appendable accum) {
        ByteArrayOutputStream out = (ByteArrayOutputStream) accum;
        return out.toString();
    }

}