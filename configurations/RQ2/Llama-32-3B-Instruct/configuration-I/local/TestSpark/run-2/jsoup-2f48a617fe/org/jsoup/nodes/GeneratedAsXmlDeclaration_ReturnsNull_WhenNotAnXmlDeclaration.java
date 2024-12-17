package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_ReturnsNull_WhenNotAnXmlDeclaration {

    @Test
    public void asXmlDeclaration_ReturnsNull_WhenNotAnXmlDeclaration() {
        // Arrange
        Comment comment = new Comment("");
        Document document = new Document();
        when(document.toString()).thenReturn("<html>test</html>");

        // Act
        XmlDeclaration actual = comment.asXmlDeclaration();

        // Assert
        assertNull(actual);
    }

}