package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        // Arrange
        String text = "";
        boolean actual = (boolean) org.jsoup.nodes.TextNode.isBlank(text);

        // Act and Assert
        assertEquals(true, actual);
    }

}