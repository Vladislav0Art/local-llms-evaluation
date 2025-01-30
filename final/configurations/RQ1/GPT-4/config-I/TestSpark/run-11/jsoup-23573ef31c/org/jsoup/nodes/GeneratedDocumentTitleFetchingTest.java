package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentTitleFetchingTest {

    @Test
    public void DocumentTitleFetchingTest() {
        String baseUri = "http://www.google.com";
        Document doc = Document.createShell(baseUri);
        Assert.assertEquals(doc.title(), "");
    }

}