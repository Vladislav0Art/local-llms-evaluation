package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclarationNoContent {

    @Test
    public void testAsXmlDeclarationNoContent() {
        // Arrange
        String data = "";
        XmlDeclaration expected = null;

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertFalse(comment.asXmlDeclaration() instanceof String);
        assertEquals(expected, comment.asXmlDeclaration());
    }

}