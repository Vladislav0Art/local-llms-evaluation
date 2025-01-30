package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentCharSetTest {

    @Test
    public void DocumentCharSetTest() {
        String baseUri = "http://www.google.com";
        Document doc = Document.createShell(baseUri);

        doc.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(doc.charset(), StandardCharsets.UTF_8);
    }

}