package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = TextNode.stripLeadingWhitespace("  test");
        Assert.assertEquals("test", text);
    }

}