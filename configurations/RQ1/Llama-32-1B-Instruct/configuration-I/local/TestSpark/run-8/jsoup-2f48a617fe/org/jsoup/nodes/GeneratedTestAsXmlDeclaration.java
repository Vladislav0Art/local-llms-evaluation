package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        // Arrange
        String data = "#This is a sample XML declaration.";
        Comment comment = new Comment("#This is a sample XML declaration.");

        // Act
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();

        // Assert
        assertTrue(xmlDecl != null);
    }

}