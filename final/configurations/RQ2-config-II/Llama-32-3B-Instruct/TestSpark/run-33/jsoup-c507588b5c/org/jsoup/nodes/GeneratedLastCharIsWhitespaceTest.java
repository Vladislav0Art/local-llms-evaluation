package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder();
        TextNode.lastCharIsWhitespace(sb.append(' ').append("\n").append(" "));
        Assert.assertTrue(lastCharIsWhitespace(sb.toString()));
        Assert.assertFalse(lastCharIsWhitespace(""));
    }

}