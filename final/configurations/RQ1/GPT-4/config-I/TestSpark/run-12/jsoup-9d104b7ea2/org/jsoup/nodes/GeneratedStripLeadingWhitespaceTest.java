package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingSpaces = "  Hello World";
        String expectedText = "Hello World";
        Assert.assertEquals(expectedText, TextNode.stripLeadingWhitespace(textWithLeadingSpaces));
    }

}