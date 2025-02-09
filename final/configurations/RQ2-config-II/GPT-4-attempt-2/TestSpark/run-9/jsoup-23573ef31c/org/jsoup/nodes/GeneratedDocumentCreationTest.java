package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentCreationTest {

    @Test
    public void DocumentCreationTest() {
        Document document = new Document("http://example.com");
        Assert.assertEquals("http://example.com", document.baseUri());
    }

}