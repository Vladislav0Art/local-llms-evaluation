package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedNormaliseWhitespace_GivesProperOutput {

    @Test
    public void normaliseWhitespace_GivesProperOutput() {
        String text = "   ";
        String expected = " ";
        String result = StringUtil.normaliseWhitespace(text);
        assertEquals(expected, result);
    }

}