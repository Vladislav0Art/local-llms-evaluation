package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateShellDocument {

    @Test
    public void createShellDocument() {
        String baseUri = "https://www.example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

}