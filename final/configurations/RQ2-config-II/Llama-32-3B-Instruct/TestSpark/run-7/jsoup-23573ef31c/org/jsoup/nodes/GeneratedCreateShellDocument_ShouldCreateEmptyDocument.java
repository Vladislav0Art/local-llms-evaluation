package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

public class GeneratedCreateShellDocument_ShouldCreateEmptyDocument {

    @Test
    public void createShellDocument_ShouldCreateEmptyDocument() {
        String baseUri = "https://www.example.com";
        Document document = Document.createShell(baseUri);
        assertTrue(document.elements().isEmpty());
    }

}