package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTextNodeStripLeadingWhitespace {

    @Test
    public void textNodeStripLeadingWhitespace() {
        String text = "   Hello World";
        assertEquals("Hello World", StringUtil.stripLeadingWhitespace(text));
    }

}