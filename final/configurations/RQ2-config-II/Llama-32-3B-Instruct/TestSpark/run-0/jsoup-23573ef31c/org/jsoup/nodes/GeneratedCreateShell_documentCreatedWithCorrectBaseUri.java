package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCreateShell_documentCreatedWithCorrectBaseUri {

    @Test
    public void createShell_documentCreatedWithCorrectBaseUri() {
        String baseUri = "https://www.example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
        assertEquals(baseUri, document.baseUri());
    }

}