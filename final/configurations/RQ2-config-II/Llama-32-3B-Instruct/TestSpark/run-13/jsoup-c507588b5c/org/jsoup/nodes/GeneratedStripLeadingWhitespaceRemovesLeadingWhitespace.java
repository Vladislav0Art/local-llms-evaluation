package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceRemovesLeadingWhitespace {

    @Test
    public void stripLeadingWhitespaceRemovesLeadingWhitespace() {
        String text = "   Hello World";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(text));
    }

}