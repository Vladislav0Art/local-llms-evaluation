package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedNormaliseWhitespace_GivenStringAndReturnsCorrectNormalisedString {

    @Test
    public void normaliseWhitespace_GivenStringAndReturnsCorrectNormalisedString() {
        String text = "Hello\nWorld!";
        String result = StringUtil.normaliseWhitespace(text);
        assertEquals("Hello World!", result);
    }

}