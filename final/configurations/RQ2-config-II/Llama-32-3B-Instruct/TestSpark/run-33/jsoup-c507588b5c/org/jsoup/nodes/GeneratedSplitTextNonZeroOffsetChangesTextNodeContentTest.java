package org.jsoup.nodes;

public class GeneratedSplitTextNonZeroOffsetChangesTextNodeContentTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void splitTextNonZeroOffsetChangesTextNodeContentTest() throws IOException {
        TextNode node = new TextNode("a");
        TextNode newNode = node.splitText(1);
        Assert.assertEquals("a", newNode.text());
    }

}