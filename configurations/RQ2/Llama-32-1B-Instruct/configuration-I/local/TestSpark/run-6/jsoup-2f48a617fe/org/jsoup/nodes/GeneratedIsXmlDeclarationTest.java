package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        // Arrange
        String xmlDeclaration = "<!DOCTYPE html><html><body></body></html>";

        when(comment.getData()).thenReturn(xmlDeclaration);

        // Act
        boolean result = comment.isXmlDeclaration();

        // Assert
        assertTrue(result);
    }

}