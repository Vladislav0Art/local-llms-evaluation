package org.jsoup.nodes;

public class GeneratedTextNodeGetWholeText_ReturnsText {

    @Test
    public void TextNodeGetWholeText_ReturnsText() {
        String text = "Hello, World!";
        TextNode node = new NodeUnderTest(text);
        String expectedWholeText = text;
        String actualWholeText = node.getWholeText();
        assertEquals(expectedWholeText, actualWholeText);
    }

}