package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhiteSpaceTest {

    @Test
    public void stripLeadingWhiteSpaceTest() {
        String text = "     Leading whitespace";
        String strippedText = TextNode.stripLeadingWhitespace(text);
        Assert.assertEquals("Leading whitespace", strippedText);
    }

}