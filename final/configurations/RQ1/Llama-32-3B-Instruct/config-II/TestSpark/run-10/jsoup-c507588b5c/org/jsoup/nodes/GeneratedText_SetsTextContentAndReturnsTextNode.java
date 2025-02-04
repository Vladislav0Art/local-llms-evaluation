package org.jsoup.nodes;

public class GeneratedText_SetsTextContentAndReturnsTextNode {

    @Test
    public void text_SetsTextContentAndReturnsTextNode() {
        String text = "text";
        TextNode textNode = new TextNode(text);
        String expectedText = StringUtil.normaliseWhitespace(text);
        assertEquals(expectedText, textNode.text());
        assertEquals(textNode, textNode.text(text));
    }

}