package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.documentType()).thenReturn(Mockito.mock(DocumentType.class));
        DocumentType documentType = document.documentType();
        Assert.assertNotNull(documentType);
    }

}