package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentConstructorTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://example.com");
        Assert.assertEquals("http://example.com", document.location());
    }

}