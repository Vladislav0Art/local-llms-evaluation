package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedStripLeadingWhitespace_Basic_Test {

    @Test
    public void stripLeadingWhitespace_Basic_Test() {
        String strippedString = TextNode.stripLeadingWhitespace("    This is a test");
        Assert.assertEquals("This is a test", strippedString);
    }

}