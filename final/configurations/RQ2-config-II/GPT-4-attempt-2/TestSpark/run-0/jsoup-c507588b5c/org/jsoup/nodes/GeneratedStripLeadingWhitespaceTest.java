package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String stripped = TextNode.stripLeadingWhitespace("    stripped");
        Assert.assertEquals("stripped", stripped);
    }

}