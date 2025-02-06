package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCreateShell_DocumentShouldBeReturned {

    @Test
    public void createShell_DocumentShouldBeReturned() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

}