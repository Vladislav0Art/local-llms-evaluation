package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String withoutLeadingWhitespace = TextNode.stripLeadingWhitespace("  Sample Text");
        Assert.assertEquals("Sample Text", withoutLeadingWhitespace);
    }

}