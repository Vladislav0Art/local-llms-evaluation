package org.jsoup.nodes;

public class GeneratedSplitTextReturnsCorrectText {

    @Test
    public void splitTextReturnsCorrectText() {
        // Given: new TextNode("Hello World")
        String text = "Hello World";
        TextNode node = new TextNode(text);

        // When: offset() == 0
        String result = node.splitText(0);

        // Then: splitText() returns expected value
        assertEquals(result, "Hello ");
    }

}