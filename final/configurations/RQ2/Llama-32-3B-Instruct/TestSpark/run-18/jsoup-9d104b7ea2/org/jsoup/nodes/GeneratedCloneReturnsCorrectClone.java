package org.jsoup.nodes;

public class GeneratedCloneReturnsCorrectClone {

    @Test
    public void cloneReturnsCorrectClone() {
        // Given: new TextNode("Hello World")
        String text = "Hello World";
        TextNode original = new TextNode(text);
        TextNode node = original.clone();

        // When: toString()
        String resultText = node.toString();

        // Then: toString() returns expected value
        assertEquals(resultText, "Hello World");
    }

}