package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectViaStringTest() {
        Connection connection = HttpConnection.connect("https://www.google.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void connectViaURLTest() throws Exception {
        URL url = new URL("https://www.google.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

    @Test
    public void urlViaStringTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url("https://www.google.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void urlViaURLTest() throws Exception {
        URL url = new URL("https://www.google.com");
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url(url);
        Assert.assertNotNull(connection);
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.userAgent("Mozilla");
        Assert.assertNotNull(connection);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.maxBodySize(2048);
        Assert.assertNotNull(connection);
    }

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.cookie("key", "value");
        Assert.assertNotNull(connection);
    }

    @Test
    public void cookiesViaMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> testCookies = new HashMap<>();
        testCookies.put("key1", "value1");
        testCookies.put("key2", "value2");
        Connection connection = httpConnection.cookies(testCookies);
        Assert.assertNotNull(connection);
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.postDataCharset("UTF-8");
        Assert.assertNotNull(connection);
    }

    @Test
    public void dataWithInputStreamTest() {
        HttpConnection httpConnection = new HttpConnection();
        ByteArrayInputStream testStream = new ByteArrayInputStream("testData".getBytes());
        Connection connection = httpConnection.data("key", "filename", testStream);
        Assert.assertNotNull(connection);
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.timeout(5000);
        Assert.assertNotNull(connection);
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.ignoreContentType(true);
        Assert.assertNotNull(connection);
    }

}