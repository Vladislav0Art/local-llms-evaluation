package org.jsoup.nodes;

public class GeneratedGetWholeTextTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode(WHITESPACE);
        Assert.assertEquals(WHITESPACE, node.getWholeText());
    }

}