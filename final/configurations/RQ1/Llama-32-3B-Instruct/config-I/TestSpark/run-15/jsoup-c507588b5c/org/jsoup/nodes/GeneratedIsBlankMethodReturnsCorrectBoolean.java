package org.jsoup.nodes;

public class GeneratedIsBlankMethodReturnsCorrectBoolean {

    private static final String BLANK_TEXT = "\n\n";
    private static final int OFFSET_1 = 5;
    private static final int OFFSET_2 = 10;

    @Test
    public void isBlankMethodReturnsCorrectBoolean() {
        String blankText = BLANK_TEXT;
        String nonBlankText = "Non Blank";
        TextNode textNode1 = new TextNode(blankText);
        TextNode textNode2 = new TextNode(nonBlankText);

        Assert.assertTrue(textNode1.isBlank());
        Assert.assertFalse(textNode2.isBlank());
    }

}