package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedLastCharIsWhitespace_GivenStringBuilderAndReturnsFalseForNonWhitespaceCharacter {

    @Test
    public void lastCharIsWhitespace_GivenStringBuilderAndReturnsFalseForNonWhitespaceCharacter() {
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        assertFalse(TextNode.lastCharIsWhitespace(sb));
        assertTrue(TextNode.lastCharIsWhitespace("\n"));
        assertTrue(TextNode.lastCharIsWhitespace(" "));
    }
}

class Document {
    public static class OutputSettings {
    }
}

class StringUtil {
    public static String normaliseWhitespace(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static String stripLeadingWhitespace(String text) {
        return text.trim();
    }

}