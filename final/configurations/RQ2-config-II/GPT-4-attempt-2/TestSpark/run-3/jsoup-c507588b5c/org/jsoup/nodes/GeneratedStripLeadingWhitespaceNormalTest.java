package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceNormalTest {

    @Test
    public void stripLeadingWhitespaceNormalTest() {
        String text = TextNode.stripLeadingWhitespace("   leading spaces");
        Assert.assertEquals("leading spaces", text);
    }

}