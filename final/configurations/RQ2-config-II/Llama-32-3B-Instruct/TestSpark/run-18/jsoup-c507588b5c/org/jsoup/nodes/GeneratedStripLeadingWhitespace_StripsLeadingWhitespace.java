package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespace_StripsLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace_StripsLeadingWhitespace() {
        String text = " \t hello world";
        String result = TextNode.stripLeadingWhitespace(text);
        assertEquals("   hello world", result);
    }

}