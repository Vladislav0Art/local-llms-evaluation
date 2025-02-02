package org.jsoup.nodes;

public class GeneratedSplitText_GivenValidTextAndOffset_ReturnsNewTextNodeWithSplitText {

    @Test
    public void splitText_GivenValidTextAndOffset_ReturnsNewTextNodeWithSplitText() {
        // Given
        TextNode textNode = new TextNode("Hello World");
        int offset = 7;

        // When
        TextNode newTextNode = textNode.splitText(offset);

        // Then
        assertNotNull(newTextNode);
        assertEquals(1, newTextNode.text().length());
    }

}