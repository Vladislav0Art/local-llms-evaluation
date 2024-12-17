package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        // Arrange
        String data = "#!";
        Comment comment = new Comment(data);
        boolean actual = comment.isXmlDeclaration();

        // Assert
        assertTrue(actual);
    }

}