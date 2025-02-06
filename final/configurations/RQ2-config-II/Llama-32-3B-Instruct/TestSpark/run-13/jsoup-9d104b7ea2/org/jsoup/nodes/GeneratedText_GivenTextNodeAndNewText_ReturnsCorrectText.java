package org.jsoup.nodes;

public class GeneratedText_GivenTextNodeAndNewText_ReturnsCorrectText {

    @Test
    public void text_GivenTextNodeAndNewText_ReturnsCorrectText() {
        String originalText = "Hello World";
        String newText = "Foo Bar";
        TextNode textNode = new TextNode(originalText);
        textNode = textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}