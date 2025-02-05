package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingWhitespace = " Test";
        String strippedText = TextNode.stripLeadingWhitespace(textWithLeadingWhitespace);
        assertEquals("Test", strippedText);
    }

}