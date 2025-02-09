package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

    @Test
    public void connectURLTest() throws IOException {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

    @Test
    public void urlStringTest() {
        String url = "http://example.com";
        HttpConnection httpConnection = new HttpConnection();
        Connection connectionResult = httpConnection.url(url);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void urlStringMalformedTest() {
        String url = "non_url";
        HttpConnection httpConnection = new HttpConnection();
        try {
            Connection connectionResult = httpConnection.url(url);
            Assert.fail("No exception caught");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void urlURLTest() throws IOException {
        URL url = new URL("http://example.com");
        HttpConnection httpConnection = new HttpConnection();
        Connection connectionResult = httpConnection.url(url);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        Connection result = httpConnection.data(data);
        Assert.assertNotNull(result);
    }

    @Test
    public void dataKeyValueTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection result = httpConnection.data("key1", "value1");
        Assert.assertNotNull(result);
    }

    @Test
    public void dataKeyValuesTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection result = httpConnection.data("key1", "value1", "key2", "value2");
        Assert.assertNotNull(result);
    }

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.1", 8080));
        Connection result = httpConnection.proxy(proxy);
        Assert.assertNotNull(result);
    }

    @Test
    public void getTest() throws IOException {
        String url = "http://example.com";
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        httpConnection.get();
    }

    @Test
    public void executeTest() throws IOException {
        String url = "http://example.com";
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        httpConnection.execute();
    }

}