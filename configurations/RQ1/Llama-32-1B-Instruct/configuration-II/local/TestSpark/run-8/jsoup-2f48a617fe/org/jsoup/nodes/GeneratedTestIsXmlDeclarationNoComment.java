package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclarationNoComment {

    @Test
    public void testIsXmlDeclarationNoComment() {
        // Arrange
        String data = "?";
        XmlDeclaration expected = null;

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertFalse(comment.isXmlDeclaration());
        assertEquals(expected, comment.asXmlDeclaration());
    }

}