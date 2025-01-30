package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentLocationTest {

    @Test
    public void DocumentLocationTest() {
        String baseUri = "https://stackoverflow.com";
        Document doc = new Document(baseUri);
        Assert.assertEquals(doc.location(), baseUri);
    }

}