package org.jsoup.nodes;

public class GeneratedTextReturnsOriginalTextWhenPassed {

    @Test
    public void textReturnsOriginalTextWhenPassed() {
        String originalText = "Hello";
        TextNode textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.text());
    }

}