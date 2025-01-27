package org.jsoup.nodes;

public class GeneratedTextReturnsCorrectText {

    @Test
    public void textReturnsCorrectText() {
        // Given: new TextNode("Hello World")
        String text = "Hello World";
        TextNode node = new TextNode(text);

        // When: text()
        String resultText = node.text();

        // Then: text() returns expected value
        assertEquals(resultText, "Hello World");
    }

}