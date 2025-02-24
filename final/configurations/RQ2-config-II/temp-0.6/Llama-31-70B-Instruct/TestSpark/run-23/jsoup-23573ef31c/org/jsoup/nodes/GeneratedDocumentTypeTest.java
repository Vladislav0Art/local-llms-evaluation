package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document document = Mockito.mock(Document.class);
        DocumentType documentType = Mockito.mock(DocumentType.class);
        when(document.documentType()).thenReturn(documentType);
        Assert.assertEquals(documentType, document.documentType());
    }

}