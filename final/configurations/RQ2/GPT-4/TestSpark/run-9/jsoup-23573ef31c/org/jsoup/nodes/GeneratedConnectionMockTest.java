package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedConnectionMockTest {

    @Test
    public void connectionMockTest() {
        Document doc = new Document("http://example.com");
        Connection connection = Jsoup.connect("http://example.com");
        doc = doc.connection(connection);
        Assert.assertEquals(connection, doc.connection());
    }

}