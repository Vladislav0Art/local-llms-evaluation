package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedNormaliseWhitespace_GivenText_ReturnsUnchangedText {

    @Test
    public void normaliseWhitespace_GivenText_ReturnsUnchangedText() {
        String text = "   Hello World";
        String expected = "   Hello World";
        assertEquals(expected, StringUtil.normaliseWhitespace(text));
    }

}