package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespace_StripsLeadingWhitespace {

    @Test
    public void normaliseWhitespace_StripsLeadingWhitespace() {
        String text = "\t hello world";
        String result = TextNode.normaliseWhitespace(text);
        assertEquals("hello world", result);
    }

}