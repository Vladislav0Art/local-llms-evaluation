package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedDocumentType {

    @Test
    public void documentType() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertNull(document.documentType());
    }

}