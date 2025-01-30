package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentCreateShellTest {

    @Test
    public void DocumentCreateShellTest() {
        String baseUri = "https://www.github.com";
        Document doc = Document.createShell(baseUri);

        Assert.assertEquals(doc.location(), baseUri);
        Assert.assertNotNull(doc.select("html"));
        Assert.assertNotNull(doc.select("head"));
        Assert.assertNotNull(doc.select("body"));
    }

}