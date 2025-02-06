package org.jsoup.nodes;

public class GeneratedText_GivenTextNode_ReturnsCorrectText {

    @Test
    public void text_GivenTextNode_ReturnsCorrectText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}