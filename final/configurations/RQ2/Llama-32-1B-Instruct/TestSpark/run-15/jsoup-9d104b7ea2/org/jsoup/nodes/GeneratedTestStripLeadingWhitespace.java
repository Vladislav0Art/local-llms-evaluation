package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        TextNode node = new TextNode("&nbsp;Hello,&#64;World!");
        String strippedText = node.stripLeadingWhitespace();
        assertNotNull(strippedText);
        assertEquals("Hello,&#64;World", strippedText);
    }

}