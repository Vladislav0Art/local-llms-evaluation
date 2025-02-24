package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.FormElement;
import org.jsoup.Connection;
import org.jsoup.select.Elements;

import java.util.List;
import java.nio.charset.Charset;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document document = new Document("https://example.com");
        DocumentType documentType = Mockito.mock(DocumentType.class);
        document.documentType(documentType);
        Assert.assertEquals(documentType, document.documentType());
    }

}