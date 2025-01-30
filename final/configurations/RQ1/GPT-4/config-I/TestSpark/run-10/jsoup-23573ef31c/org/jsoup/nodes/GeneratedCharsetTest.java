package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://test.com");
        document.charset(StandardCharsets.UTF_16);
        Assert.assertEquals(StandardCharsets.UTF_16, document.charset());
    }

}