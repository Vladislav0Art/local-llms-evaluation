package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedDocumentType_documentTypeMethodReturnsCorrectDocumentType {

    @Test
    public void documentType_documentTypeMethodReturnsCorrectDocumentType() {
        String expectedDocumentType = "html";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedDocumentType, document.documentType());
    }

}