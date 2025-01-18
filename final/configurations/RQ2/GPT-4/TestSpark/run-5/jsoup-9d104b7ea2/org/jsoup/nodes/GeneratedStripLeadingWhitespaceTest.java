package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String leading = TextNode.stripLeadingWhitespace("   test text");
        Assert.assertEquals("test text", leading);
    }

}