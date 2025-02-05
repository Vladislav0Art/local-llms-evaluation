package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedParserTest {

    @Test
    public void parserTest() throws IOException {
        Connection connection = HttpConnection.connect("https://www.example.com");
        connection.parser(Parser.htmlParser());
        Assert.assertEquals(Parser.htmlParser().getClass(), connection.request().parser().getClass());
    }

}