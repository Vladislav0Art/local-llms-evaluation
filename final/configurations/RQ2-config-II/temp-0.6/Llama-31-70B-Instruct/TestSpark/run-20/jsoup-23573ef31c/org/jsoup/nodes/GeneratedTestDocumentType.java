package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDocumentType {

    @Test
    public void testDocumentType() {
        // Arrange
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.documentType()).thenReturn(null);

        // Act
        DocumentType documentType = document.documentType();

        // Assert
        assertNull(documentType);
    }

}