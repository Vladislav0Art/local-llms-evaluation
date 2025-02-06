package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespaceTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void stripLeadingWhitespaceTest() {
        Assert.assertEquals("", TextNode.stripLeadingWhitespace(BLANK));
    }

}