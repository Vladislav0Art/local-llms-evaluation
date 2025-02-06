package org.jsoup.nodes;

public class GeneratedGetNodeNameTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void getNodeNameTest() {
        TextNode node = new TextNode(WHITESPACE);
        Assert.assertEquals("text", node.nodeName());
    }

}