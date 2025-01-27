package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedCreateShell_documentCreatedWithCorrectUri {

    @Test
    public void createShell_documentCreatedWithCorrectUri() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

}