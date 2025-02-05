package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectUrlTest() {
        try {
            URL url = new URL("http://google.com");
            Connection connection = HttpConnection.connect(url);
            Assert.assertNotNull(connection);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void connectStringTest() {
        HttpConnection.connect("bad url string");
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Assert.assertNotNull(httpConnection.newRequest());
    }

    @Test
    public void urlTest() {
        try {
            URL url = new URL("http://google.com");
            HttpConnection httpConnection = new HttpConnection();
            Assert.assertEquals(httpConnection, httpConnection.url(url));
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void proxyTest() {
        Proxy proxy = Mockito.mock(Proxy.class);
        HttpConnection httpConnection = new HttpConnection();
        Assert.assertEquals(httpConnection, httpConnection.proxy(proxy));
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        Assert.assertEquals(httpConnection, httpConnection.userAgent("test-agent"));
    }

    @Test
    public void dataStreamTest() {
        HttpConnection httpConnection = new HttpConnection();
        InputStream stream = new ByteArrayInputStream("test data".getBytes());
        Assert.assertEquals(httpConnection, httpConnection.data("key", "filename", stream));
    }

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Assert.assertEquals(httpConnection, httpConnection.data(data));
    }

    @Test
    public void requestBodyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Assert.assertEquals(httpConnection, httpConnection.requestBody("request body"));
    }

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("header", "value");
        Assert.assertEquals(httpConnection, httpConnection.headers(headers));
    }

    @Test
    public void parserTest() {
        HttpConnection httpConnection = new HttpConnection();
        Parser parser = Mockito.mock(Parser.class);
        Assert.assertEquals(httpConnection, httpConnection.parser(parser));
    }

    @Test
    public void executeTest() {
        try {
            HttpConnection httpConnection = new HttpConnection();
            httpConnection.url(new URL("http://google.com"));
            Assert.assertNotNull(httpConnection.execute());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}