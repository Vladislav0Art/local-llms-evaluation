package org.jsoup.nodes;

public class GeneratedTextMethodReturnsCorrectString {

    private static final String BLANK_TEXT = "\n\n";
    private static final int OFFSET_1 = 5;
    private static final int OFFSET_2 = 10;

    @Test
    public void textMethodReturnsCorrectString() {
        String text = BLANK_TEXT;
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(StringUtil.normaliseWhitespace(text), textNode.text());
    }

}