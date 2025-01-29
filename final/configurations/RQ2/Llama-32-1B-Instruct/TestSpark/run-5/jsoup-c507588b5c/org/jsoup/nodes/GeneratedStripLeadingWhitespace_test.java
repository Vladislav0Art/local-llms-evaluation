package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedStripLeadingWhitespace_test {

    @Test
    public void stripLeadingWhitespace_test() {
        String text = "   Hello   World  ";
        String strippedText = StripLeadingWhitespace(text);
        assertEquals("Hello World", strippedText);
    }

}