package org.jsoup.nodes;

public class GeneratedGetTextAfterConstructionTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void getTextAfterConstructionTest() {
        TextNode node = new TextNode();
        Assert.assertNull(node.text());
    }

}