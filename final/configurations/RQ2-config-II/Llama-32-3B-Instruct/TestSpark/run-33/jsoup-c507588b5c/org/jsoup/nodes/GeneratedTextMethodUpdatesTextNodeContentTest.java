package org.jsoup.nodes;

public class GeneratedTextMethodUpdatesTextNodeContentTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void textMethodUpdatesTextNodeContentTest() {
        TextNode node = new TextNode(EMPTY_STRING);
        node.text(WHITESPACE);
        Assert.assertEquals(WHITESPACE, node.text());
    }

}