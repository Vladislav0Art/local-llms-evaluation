package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentConstructorTest {

    @Test
    public void DocumentConstructorTest() {
        String baseUri = "https://www.github.com";
        Document doc = new Document(baseUri);
        Assert.assertEquals(doc.location(), baseUri);
    }

}