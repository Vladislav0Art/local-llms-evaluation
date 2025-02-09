package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedSetAndGetTitleTest {

    @Test
    public void setAndGetTitleTest() {
        Document document = new Document("http://example.com");
        document.title("Example Test");
        Assert.assertEquals("Example Test", document.title());
    }

}