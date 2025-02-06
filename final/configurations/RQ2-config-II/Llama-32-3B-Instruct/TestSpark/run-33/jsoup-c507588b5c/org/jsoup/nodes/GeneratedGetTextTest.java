package org.jsoup.nodes;

public class GeneratedGetTextTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void getTextTest() {
        TextNode node = new TextNode(WHITESPACE);
        Assert.assertEquals(WHITESPACE, node.text());
    }

}