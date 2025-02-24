package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document document = Document.createShell("http://example.com");
        assertEquals(document.documentType(), null);
    }

}