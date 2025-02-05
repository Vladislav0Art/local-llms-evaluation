package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String initialText = "  leading whitespace";
        String strippedText = TextNode.stripLeadingWhitespace(initialText);
        Assert.assertEquals("leading whitespace", strippedText);
    }

}