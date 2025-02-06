package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedDocumentTypeDocument_test {

    @Test
    public void documentTypeDocument_test() {
        Document document = Document.createShell("http://example.com");
        DocumentType documentType = document.documentType();
        assertNull(documentType);
    }

}