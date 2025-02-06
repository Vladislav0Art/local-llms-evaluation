package org.jsoup.nodes;

public class GeneratedNormaliseWhitespaceTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void normaliseWhitespaceTest() {
        Assert.assertEquals("   ", TextNode.normaliseWhitespace(WHITESPACE));
    }

}