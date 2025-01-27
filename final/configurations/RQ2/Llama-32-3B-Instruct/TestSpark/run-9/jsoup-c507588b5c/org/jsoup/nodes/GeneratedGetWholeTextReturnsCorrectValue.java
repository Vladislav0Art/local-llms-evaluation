package org.jsoup.nodes;

public class GeneratedGetWholeTextReturnsCorrectValue {

    @Test
    public void getWholeTextReturnsCorrectValue() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        String wholeText = textNode.getWholeText();
        assertNotNull(wholeText);
        assertTrue(wholeText.contains(text));
    }

}