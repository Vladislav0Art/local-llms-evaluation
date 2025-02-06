package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedCreateShell_ValidBaseUri_ReturnsDocument {

    @Test
    public void createShell_ValidBaseUri_ReturnsDocument() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
        assertEquals(baseUri, document.location());
    }

}