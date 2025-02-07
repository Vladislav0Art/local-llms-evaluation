package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestNormaliseWhitespaceReturnsOriginalWhitespace {

    @Test
    public void testNormaliseWhitespaceReturnsOriginalWhitespace() {
        String text = "   Hello   ";
        assertEquals("Hello ", Normalizer.normalizeWhitespace(text));
    }

}