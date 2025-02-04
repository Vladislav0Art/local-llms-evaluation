package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_isNullForInvalidData {

    @Test
    public void asXmlDeclaration_isNullForInvalidData() {
        // Given
        String data = "This is invalid data";

        // When
        XmlDeclaration decl = new Comment(data).asXmlDeclaration();

        // Then
        assertNull(decl);
    }

}