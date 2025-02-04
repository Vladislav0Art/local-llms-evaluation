package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_isCorrect {

    @Test
    public void isXmlDeclaration_isCorrect() {
        // Given
        String data = "This is an XML declaration";

        // When
        boolean isDeclaration = new Comment(data).isXmlDeclaration();

        // Then
        assertTrue(isDeclaration);
    }

}