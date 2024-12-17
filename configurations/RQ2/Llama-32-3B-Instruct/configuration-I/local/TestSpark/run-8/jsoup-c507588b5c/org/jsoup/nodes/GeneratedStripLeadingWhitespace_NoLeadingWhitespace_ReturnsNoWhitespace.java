package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedStripLeadingWhitespace_NoLeadingWhitespace_ReturnsNoWhitespace {

    @Test
    public void stripLeadingWhitespace_NoLeadingWhitespace_ReturnsNoWhitespace() {
        String text = "";
        String result = TextNode.stripLeadingWhitespace(text);
        assertEquals("", result);
    }

}