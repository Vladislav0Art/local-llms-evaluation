package org.jsoup.nodes;

public class GeneratedDocumentType_ReturnsDocumentTypeObject {

    @Test
    public void documentType_ReturnsDocumentTypeObject() {
        // Arrange
        DocumentType documentType = new DocumentType();
        Document document = new Document(documentType);

        // Act
        DocumentType actual = document.documentType();

        // Assert
        assertThat(actual, is(documentType));
    }

}