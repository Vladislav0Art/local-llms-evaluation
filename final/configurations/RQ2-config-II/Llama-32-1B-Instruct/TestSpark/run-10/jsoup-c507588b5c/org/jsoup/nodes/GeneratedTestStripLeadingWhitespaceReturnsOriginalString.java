package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestStripLeadingWhitespaceReturnsOriginalString {

    @Test
    public void testStripLeadingWhitespaceReturnsOriginalString() {
        String text = "   Hello World  ";
        assertEquals("Hello World", StripLeadingWhitespace.strip(text));
    }

}