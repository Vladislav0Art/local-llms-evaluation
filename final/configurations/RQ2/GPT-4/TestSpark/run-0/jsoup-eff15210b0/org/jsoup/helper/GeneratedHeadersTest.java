package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("header1", "value1");
        headers.put("header2", "value2");

        Connection connection = Jsoup.connect("http://www.google.com").headers(headers);
        Assert.assertFalse(connection.request().headers().isEmpty());
    }

}