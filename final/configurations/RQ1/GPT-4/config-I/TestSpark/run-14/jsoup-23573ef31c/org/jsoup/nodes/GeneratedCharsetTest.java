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

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://test.com/");
        document.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(StandardCharsets.UTF_8, document.charset());
    }

}