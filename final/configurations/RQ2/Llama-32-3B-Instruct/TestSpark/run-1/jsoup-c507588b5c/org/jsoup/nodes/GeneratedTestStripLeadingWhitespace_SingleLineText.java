package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestStripLeadingWhitespace_SingleLineText {

    @Test
    public void testStripLeadingWhitespace_SingleLineText() {
        String output = TextNode.stripLeadingWhitespace("   Hello World");
        assertTrue(!output.startsWith("   "));
    }

}