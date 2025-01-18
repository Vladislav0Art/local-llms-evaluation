package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectInvalidStringTest() {
        Connection connection = HttpConnection.connect("invalid_url");
    }

    @Test
    public void connectURLTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        String userAgent = "Mozilla/5.0";
        assertEquals(userAgent, httpConnection.userAgent(userAgent).request().header("User-Agent"));
    }

    @Test
    public void dataKeyValueTest() {
        HttpConnection httpConnection = new HttpConnection();
        String key = "key";
        String value = "value";
        Connection.KeyVal data = httpConnection.data(key, value).request().data().iterator().next();
        assertEquals(key, data.key());
        assertEquals(value, data.value());
    }

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        int dataSize = httpConnection.data(map).request().data().size();
        assertEquals(2, dataSize);
    }

    @Test
    public void getMethodTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        assertNotNull(httpConnection.get());
    }

    @Test
    public void postMethodTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        assertNotNull(httpConnection.post());
    }

}