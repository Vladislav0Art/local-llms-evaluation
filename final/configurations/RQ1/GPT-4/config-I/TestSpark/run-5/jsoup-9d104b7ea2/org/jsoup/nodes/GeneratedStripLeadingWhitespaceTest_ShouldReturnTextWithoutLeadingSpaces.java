package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedStripLeadingWhitespaceTest_ShouldReturnTextWithoutLeadingSpaces {

    @Test
    public void stripLeadingWhitespaceTest_ShouldReturnTextWithoutLeadingSpaces() {
        String result = TextNode.stripLeadingWhitespace("     Lorem ipsum dolor.");
        assertEquals("Lorem ipsum dolor.", result);
    }

}