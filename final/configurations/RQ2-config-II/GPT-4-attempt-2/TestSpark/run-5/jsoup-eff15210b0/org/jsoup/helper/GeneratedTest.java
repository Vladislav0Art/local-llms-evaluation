package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void connectURLTest() throws Exception {
        URL url = new URL("http://www.google.com");
        Connection connection = HttpConnection.connect(url);

        assertTrue(connection instanceof Connection);
    }

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://www.google.com");

        assertTrue(connection instanceof Connection);
    }

    @Test
    public void urlTest() {
        HttpConnection httpConnection = new HttpConnection();

        httpConnection.url("http://www.google.com");

        assertEquals("http://www.google.com", httpConnection.request().url().toString());
    }

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();

        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");

        httpConnection.data(data);

        assertEquals("value1", httpConnection.request().data().get(0).value());
        assertEquals("value2", httpConnection.request().data().get(1).value());
    }

    @Test
    public void dataKeyValTest() {
        HttpConnection httpConnection = new HttpConnection();

        httpConnection.data("key", "value");

        assertEquals("value", httpConnection.request().data().get(0).value());
    }

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==");

        httpConnection.headers(headers);

        assertEquals("application/json", httpConnection.request().headers().get("Content-Type"));
        assertEquals("Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==", httpConnection.request().headers().get("Authorization"));
    }

    @Test
    public void cookiesTest() {
        HttpConnection httpConnection = new HttpConnection();

        Map<String, String> cookies = new HashMap<>();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");

        httpConnection.cookies(cookies);

        assertEquals("value1", httpConnection.request().cookies().get("cookie1"));
        assertEquals("value2", httpConnection.request().cookies().get("cookie2"));
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();

        httpConnection.url("http://www.google.com");

        Document doc = httpConnection.get();

        assertEquals("Google", doc.title());
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();

        httpConnection.url("http://httpbin.org/post")
                .ignoreContentType(true)
                .data("key", "value")
                .method(Connection.Method.POST);

        Document doc = httpConnection.post();

        assertTrue(doc.text().contains("value"));
    }

}