package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document document = new Document("https://www.example.com");
        DocumentType documentType = document.documentType();
        Assert.assertNull(documentType);
    }

}