package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDocumentTest {

    @Test
    public void DocumentTest() {
        Document document = new Document("http://test.com/");
        Assert.assertEquals("#document", document.nodeName());
    }

}