package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

public class GeneratedClone_ShouldReturnNewDocument {

    @Test
    public void clone_ShouldReturnNewDocument() {
        Document document = new Document();
        Document clonedDocument = document.clone();
        assertNotNull(clonedDocument);
        assertTrue(!document.equals(clonedDocument));
    }
}

public class DocumentHelper {

    public static Document createShell(String baseUri) {
        return Jsoup.connect(baseUri).getDocument();
    }

    public static String location(Document document) {
        return document.location();
    }

    public static Element createElement(Document document, String tagName) {
        return document.createElement(tagName);
    }

}