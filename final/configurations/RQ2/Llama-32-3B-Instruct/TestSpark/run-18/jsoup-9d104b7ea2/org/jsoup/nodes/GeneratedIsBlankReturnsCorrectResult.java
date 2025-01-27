package org.jsoup.nodes;

public class GeneratedIsBlankReturnsCorrectResult {

    @Test
    public void isBlankReturnsCorrectResult() {
        // Given: new TextNode("")
        String text = "";
        TextNode node = new TextNode(text);

        // When: isBlank()
        boolean result = node.isBlank();

        // Then: isBlank() returns expected value
        assertTrue(result);
    }

}