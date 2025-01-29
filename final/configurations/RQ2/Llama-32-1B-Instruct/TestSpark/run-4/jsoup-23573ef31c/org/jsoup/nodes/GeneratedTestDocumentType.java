package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTestDocumentType {

    private Document document = new Document("");

    @Test
    public void testDocumentType() {
        when(document.documentType()).thenReturn(Document.DocumentType.PAGE);
        String result = document.documentType();
        assertEquals(Document.DocumentType.PAGE, result);
    }

}