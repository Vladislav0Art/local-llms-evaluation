package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.DocumentType;
import org.jsoup.select.Elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTestDocumentType {

    @Test
    public void testDocumentType() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        DocumentType documentType = document.documentType();

        assertNull(documentType);
    }

}