package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedNormaliseWhitespace_SimpleText_ReturnsTrimmedString {

    @Test
    public void normaliseWhitespace_SimpleText_ReturnsTrimmedString() {
        assertEquals("Hello World", TextNode.normaliseWhitespace("   Hello   World  "));
    }

}