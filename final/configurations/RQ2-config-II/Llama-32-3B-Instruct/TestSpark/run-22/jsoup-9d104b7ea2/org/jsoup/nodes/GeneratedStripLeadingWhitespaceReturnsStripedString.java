package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedStripLeadingWhitespaceReturnsStripedString {

    @Test
    public void stripLeadingWhitespaceReturnsStripedString() {
        String expectedText = "strippedText";
        TextNode testNode = new TextNode(expectedText);
        String result = TextNode.stripLeadingWhitespace(testNode.text());
        assertEquals("expectedText", result);
    }

}