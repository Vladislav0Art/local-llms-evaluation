package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedCreateShellBasicTest {

    @Test
    public void createShellBasicTest() {
        Document document = Document.createShell("http://example.com");
        org.junit.Assert.assertNotNull(document);
    }

}