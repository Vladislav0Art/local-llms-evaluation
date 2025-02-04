package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedStripLeadingWhitespace_GivesProperOutput {

    @Test
    public void stripLeadingWhitespace_GivesProperOutput() {
        String text = "   Hello World";
        String expected = "Hello World";
        String result = StringUtil.stripLeadingWhitespace(text);
        assertEquals(expected, result);
    }

}