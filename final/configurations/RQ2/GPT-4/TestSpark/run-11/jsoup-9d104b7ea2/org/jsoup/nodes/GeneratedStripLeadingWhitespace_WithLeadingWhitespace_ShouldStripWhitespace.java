package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedStripLeadingWhitespace_WithLeadingWhitespace_ShouldStripWhitespace {

    @Test
    public void stripLeadingWhitespace_WithLeadingWhitespace_ShouldStripWhitespace() {
        String result = TextNode.stripLeadingWhitespace(" White space");
        Assert.assertEquals("White space", result);
    }

}