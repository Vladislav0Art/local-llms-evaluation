package org.jsoup.nodes;

public class GeneratedTextSetsCorrectValue {

    private TextNode textNode;

    @Test
    public void textSetsCorrectValue() {
        String originalText = "Hello World";
        textNode = new TextNode();
        textNode.text(originalText);
        assertEquals(originalText, textNode.text());
    }

}