package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentLocationTest {

    @Test
    public void DocumentLocationTest() {
        Document document = new Document("http://realtest.com");
        Assert.assertEquals("http://realtest.com", document.location());
    }

}