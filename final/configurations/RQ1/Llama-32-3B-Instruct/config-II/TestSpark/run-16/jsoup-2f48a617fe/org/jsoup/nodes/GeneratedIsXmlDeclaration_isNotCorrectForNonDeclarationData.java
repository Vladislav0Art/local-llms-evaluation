package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_isNotCorrectForNonDeclarationData {

    @Test
    public void isXmlDeclaration_isNotCorrectForNonDeclarationData() {
        // Given
        String data = "This is not a comment";

        // When
        boolean isDeclaration = new Comment(data).isXmlDeclaration();

        // Then
        assertFalse(isDeclaration);
    }

}