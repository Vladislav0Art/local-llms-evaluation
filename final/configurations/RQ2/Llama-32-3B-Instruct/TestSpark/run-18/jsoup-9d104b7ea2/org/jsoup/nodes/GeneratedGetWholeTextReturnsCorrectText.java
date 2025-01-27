package org.jsoup.nodes;

public class GeneratedGetWholeTextReturnsCorrectText {

    @Test
    public void getWholeTextReturnsCorrectText() {
        // Given: new TextNode("Hello\nWorld")
        String text = "Hello\nWorld";
        TextNode node = new TextNode(text);

        // When: getWholeText()
        String resultText = node.getWholeText();

        // Then: getWholeText() returns expected value
        assertEquals(resultText, "Hello\nWorld");
    }

}