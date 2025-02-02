package org.jsoup.nodes;

public class GeneratedCloneMethodReturnsCorrectTextNode {

    private static final String BLANK_TEXT = "\n\n";
    private static final int OFFSET_1 = 5;
    private static final int OFFSET_2 = 10;

    @Test
    public void cloneMethodReturnsCorrectTextNode() {
        String originalText = BLANK_TEXT;
        TextNode textNode = new TextNode(originalText);
        TextNode clonedTextNode = textNode.clone();
        Assert.assertEquals(StringUtil.normaliseWhitespace(originalText), clonedTextNode.getWholeText());
    }

}