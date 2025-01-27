package org.jsoup.nodes;

public class GeneratedTextReturnsOriginalText {

    @Test
    public void textReturnsOriginalText() {
        String originalText = "text";
        TextNode node = new MockTextNode(originalText);
        assertEquals(originalText, node.text());
    }

}