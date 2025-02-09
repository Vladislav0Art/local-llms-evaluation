package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "    Leading spaces";
        String stripped = TextNode.stripLeadingWhitespace(text);
        Assert.assertEquals("Leading spaces", stripped);
    }

}