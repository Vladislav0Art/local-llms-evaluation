package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenNullText_ThrowsNullPointerException {

    @Test
    public void createTextNode_GivenNullText_ThrowsNullPointerException() {
        // Given
        String nullText = null;

        // When
        assertThrows(NullPointerException.class, () -> new TextNode(nullText));
    }

}