package org.jsoup.nodes;

public class GeneratedSetTextNodeSetsCorrectText {

    private static final String BLANK_TEXT = "\n\n";
    private static final int OFFSET_1 = 5;
    private static final int OFFSET_2 = 10;

    @Test
    public void setTextNodeSetsCorrectText() {
        String originalText = BLANK_TEXT;
        TextNode textNode = new TextNode(originalText);
        textNode.text(BLANK_TEXT + "New");
        Assert.assertEquals(originalText, textNode.getWholeText());
    }

}