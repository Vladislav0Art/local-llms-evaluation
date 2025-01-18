package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingWhitespace = "      stripTest";
        String strippedText = TextNode.stripLeadingWhitespace(textWithLeadingWhitespace);

        Assert.assertEquals("stripTest", strippedText);
    }

}