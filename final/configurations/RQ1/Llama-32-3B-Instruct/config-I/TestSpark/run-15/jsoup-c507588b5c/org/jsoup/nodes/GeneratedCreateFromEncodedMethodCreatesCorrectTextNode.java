package org.jsoup.nodes;

public class GeneratedCreateFromEncodedMethodCreatesCorrectTextNode {

    private static final String BLANK_TEXT = "\n\n";
    private static final int OFFSET_1 = 5;
    private static final int OFFSET_2 = 10;

    @Test
    public void createFromEncodedMethodCreatesCorrectTextNode() {
        String encodedText = "&lt;BLANK&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        Assert.assertTrue(textNode.isBlank());
    }

}