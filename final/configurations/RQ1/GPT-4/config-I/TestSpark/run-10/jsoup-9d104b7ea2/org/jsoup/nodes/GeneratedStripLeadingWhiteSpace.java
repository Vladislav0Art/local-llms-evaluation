package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhiteSpace {

    @Test
    public void stripLeadingWhiteSpace() {
        String text = "  Test Node";
        Assert.assertEquals("Test Node", TextNode.stripLeadingWhitespace(text));
    }

}