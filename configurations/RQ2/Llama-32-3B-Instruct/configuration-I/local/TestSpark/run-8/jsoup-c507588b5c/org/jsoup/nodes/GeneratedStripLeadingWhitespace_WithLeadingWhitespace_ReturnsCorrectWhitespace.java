package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedStripLeadingWhitespace_WithLeadingWhitespace_ReturnsCorrectWhitespace {

    @Test
    public void stripLeadingWhitespace_WithLeadingWhitespace_ReturnsCorrectWhitespace() {
        String text = "   ";
        String result = TextNode.stripLeadingWhitespace(text);
        assertEquals(" ", result);
    }

}