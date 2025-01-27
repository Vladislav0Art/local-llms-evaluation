package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedCreateShell {

    @Test
    public void createShell() {
        String baseUri = "https://example.com";
        Document doc = Document.createShell(baseUri);
        assertNotNull(doc);
    }

}