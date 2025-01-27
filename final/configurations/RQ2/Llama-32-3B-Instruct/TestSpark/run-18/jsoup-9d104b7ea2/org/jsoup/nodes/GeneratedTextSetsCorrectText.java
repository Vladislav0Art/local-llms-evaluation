package org.jsoup.nodes;

public class GeneratedTextSetsCorrectText {

    @Test
    public void textSetsCorrectText() {
        // Given: new TextNode("")
        String text = "";
        TextNode node = new TextNode(text);

        // When: node.setText("New Hello World")
        node.text("New Hello World");

        // Then: text() returns expected value
        assertEquals(node.text(), "New Hello World");
    }

}