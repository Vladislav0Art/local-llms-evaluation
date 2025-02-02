package org.jsoup.nodes;

public class GeneratedSplitTextReturnsCorrectTextNode {

    private static final String BLANK_TEXT = "\n\n";
    private static final int OFFSET_1 = 5;
    private static final int OFFSET_2 = 10;

    @Test
    public void splitTextReturnsCorrectTextNode() {
        String text = BLANK_TEXT;
        TextNode textNode = new TextNode(text);
        int offset = OFFSET_1;
        TextNode resultTextNode = textNode.splitText(offset);
        Assert.assertEquals(StringUtil.normaliseWhitespace(text.substring(0, offset)), resultTextNode.getWholeText());
    }

}