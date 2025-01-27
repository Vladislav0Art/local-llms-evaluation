package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedStripLeadingWhitespace_GivenStringAndReturnsCorrectStripedString {

    @Test
    public void stripLeadingWhitespace_GivenStringAndReturnsCorrectStripedString() {
        String text = "  Hello";
        String result = StringUtil.stripLeadingWhitespace(text);
        assertEquals("Hello", result);
    }

}