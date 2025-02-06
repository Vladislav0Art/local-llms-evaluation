package org.jsoup.nodes;

public class GeneratedSplitTextZeroOffsetReturnsSameTextNodeTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void splitTextZeroOffsetReturnsSameTextNodeTest() throws IOException {
        TextNode node = new TextNode(WHITESPACE);
        TextNode newNode = node.splitText(0);
        Assert.assertEquals(node, newNode);
    }

}