package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void connectStringURLTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals("http://example.com", connection.request().url().toString());
        assertTrue(connection instanceof Connection);
    }

    @Test
    public void invalidURLTest() throws Exception {
        HttpConnection.connect("invalid_url");
    }

    @Test
    public void connectURLTest() throws IOException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertEquals("http://example.com", connection.request().url().toString());
    }

    @Test
    public void userAgentTest() {
        Connection connection = new HttpConnection();
        connection.userAgent("Mozilla");
        assertEquals("Mozilla", connection.request().header("User-Agent"));
    }

    @Test
    public void urlTest() throws Exception {
        Connection connection = new HttpConnection();
        URL testURL = new URL("http://testurl.com");
        connection.url(testURL);
        assertEquals(testURL, connection.request().url());
    }

    @Test
    public void followRedirectsTest() {
        Connection connection = new HttpConnection();
        connection.followRedirects(true);
        assertTrue(connection.request().followRedirects());
    }

    @Test
    public void sslSocketFactoryTest() {
        Connection connection = new HttpConnection();
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        connection.sslSocketFactory(sslSocketFactory);
        assertEquals(sslSocketFactory, connection.request().sslSocketFactory());
    }

    @Test
    public void dataInputStreamTest() throws IOException {
        Connection connection = new HttpConnection();
        InputStream stream = new ByteArrayInputStream("test".getBytes());
        connection.data("key", "fname", stream);

        for (Connection.KeyVal keyVal : connection.request().data()) {
            if (keyVal.key().equals("key")) {
                assertTrue(keyVal.hasInputStream());
            }
        }
    }

    @Test
    public void dataTest() {
        Connection connection = new HttpConnection();
        connection.data("key", "value");
        for (Connection.KeyVal keyVal : connection.request().data()) {
            if (keyVal.key().equals("key")) {
                assertEquals("value", keyVal.value());
            }
        }
    }

    @Test
    public void headersTest() {
        Connection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("header1", "value1");
        headers.put("header2", "value2");
        connection.headers(headers);
        assertEquals(headers, connection.request().headers());
    }

    @Test
    public void getTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Document doc = connection.get();
        assertTrue(doc.title().contains("Example Domain"));
    }

    @Test
    public void postTest() throws IOException {
        Connection connection = HttpConnection.connect("http://httpbin.org/post");
        connection.data("custname", "myname");
        Document doc = connection.post();
        assertTrue(doc.body().text().contains("myname"));
    }

}