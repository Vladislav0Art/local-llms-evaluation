package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_AnyInputReturnsCorrectResult {

    @Test
    public void stripLeadingWhitespace_AnyInputReturnsCorrectResult() {
        assertEquals("Hello", StringUtil.stripLeadingWhitespace("   Hello"));
        assertEquals("Hello World", StringUtil.stripLeadingWhitespace("Hello World "));
    }

}