package org.jsoup.nodes;

public class GeneratedText Method_ReturnsNormalizedWhitespaceText {

    @Test
    public void text

    Method_ReturnsNormalizedWhitespaceText() {
        String rawText = "\n   \t";
        TextNode textNode = new TextNode(rawText);
        String result = textNode.text();
        assertTrue(result.contains("\n"));
        assertTrue(result.contains(" "));
    }

}