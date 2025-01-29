package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedNormaliseWhitespace_test {

    @Test
    public void normaliseWhitespace_test() {
        String text = "   Hello   World  ";
        StringBuilder sb = new StringBuilder();
        String normalizedText = StripLeadingWhitespace(sb.toString());
        assertEquals("Hello World", normalizedText);
    }

}