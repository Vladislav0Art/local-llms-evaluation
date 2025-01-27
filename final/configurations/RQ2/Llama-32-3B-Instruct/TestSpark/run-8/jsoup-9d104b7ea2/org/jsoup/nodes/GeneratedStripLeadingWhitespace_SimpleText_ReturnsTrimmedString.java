package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedStripLeadingWhitespace_SimpleText_ReturnsTrimmedString {

    @Test
    public void stripLeadingWhitespace_SimpleText_ReturnsTrimmedString() {
        assertEquals("Hello World", TextNode.stripLeadingWhitespace("   Hello   World  "));
    }

}