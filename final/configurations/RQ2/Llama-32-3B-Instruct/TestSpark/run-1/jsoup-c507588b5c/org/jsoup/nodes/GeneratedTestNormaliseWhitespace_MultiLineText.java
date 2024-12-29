package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestNormaliseWhitespace_MultiLineText {

    @Test
    public void testNormaliseWhitespace_MultiLineText() {
        String output = TextNode.normaliseWhitespace("   Hello World ");
        assertFalse(output.contains("\n"));
    }

}