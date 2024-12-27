package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void StripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace(" hello world");
        Assert.assertEquals("hello world", result);
    }

}