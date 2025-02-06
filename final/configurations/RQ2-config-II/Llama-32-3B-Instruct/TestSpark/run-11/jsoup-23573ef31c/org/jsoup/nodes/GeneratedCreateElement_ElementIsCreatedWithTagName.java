package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedCreateElement_ElementIsCreatedWithTagName {

    @Test
    public void createElement_ElementIsCreatedWithTagName() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        Element element = document.createElement("div");
        assertNotNull(element);
        assertTrue(element instanceof Element);
    }

}