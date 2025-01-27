package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedCreateShellWithBaseUriTest {

    @Test
    public void createShellWithBaseUriTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        org.junit.Assert.assertEquals(baseUri, document.baseUri());
    }

}