package org.jsoup.nodes;

public class GeneratedIsBlankTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode(WHITESPACE);
        Assert.assertTrue(node.isBlank());

        TextNode node2 = new TextNode(BLANK);
        Assert.assertFalse(node2.isBlank());
    }

}