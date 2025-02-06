package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTextNodeLastCharIsWhitespace {

    @Test
    public void textNodeLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb.append(' ')));
        assertFalse(TextNode.lastCharIsWhitespace(sb.append('A')));
    }

}