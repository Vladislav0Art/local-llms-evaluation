package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document document = new Document("https://www.google.com");
        DocumentType documentType = document.documentType();
        Assert.assertNull(documentType);
    }

}