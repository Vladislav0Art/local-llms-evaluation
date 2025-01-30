package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document document = Document.createShell("https://example.com");
        Assert.assertNull(document.documentType());
    }

}