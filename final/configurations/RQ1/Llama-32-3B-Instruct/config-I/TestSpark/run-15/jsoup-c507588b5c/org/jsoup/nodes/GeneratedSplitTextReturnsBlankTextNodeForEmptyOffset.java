package org.jsoup.nodes;

public class GeneratedSplitTextReturnsBlankTextNodeForEmptyOffset {

    private static final String BLANK_TEXT = "\n\n";
    private static final int OFFSET_1 = 5;
    private static final int OFFSET_2 = 10;

    @Test
    public void splitTextReturnsBlankTextNodeForEmptyOffset() {
        String text = BLANK_TEXT;
        TextNode textNode = new TextNode(text);
        int offset = 0;
        TextNode resultTextNode = textNode.splitText(offset);
        Assert.assertTrue(resultTextNode.isBlank());
    }

}