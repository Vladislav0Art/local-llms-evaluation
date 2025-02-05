package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectUrlStringTest() {
        Connection connection = HttpConnection.connect("https://google.com");
        assertNotNull(connection);
    }

    @Test
    public void connectUrlStringInvalidTest() {
        HttpConnection.connect("invalid-url");
    }

    @Test
    public void connectUrlObjectTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("https://google.com"));
        assertNotNull(connection);
    }

    @Test
    public void urlUrlObjectTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url(new URL("https://google.com"));
        assertNotNull(connection.request().url());
    }

    @Test
    public void urlUrlStringTest() {
        HttpConnection connection = new HttpConnection();
        connection.url("https://google.com");
        assertNotNull(connection.request().url());
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Mozilla");
        assertEquals("Mozilla", connection.request().userAgent());
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(5000);
        assertEquals(5000, connection.request().timeout());
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(1024);
        assertEquals(1024, connection.request().maxBodySize());
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreHttpErrors(true);
        assertTrue(connection.request().ignoreHttpErrors());
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreContentType(true);
        assertTrue(connection.request().ignoreContentType());
    }

    @Test
    public void dataSingleKeyValueTest() {
        HttpConnection connection = new HttpConnection();
        Connection con = connection.data("key1", "value1");
        assertNotNull(con);
    }

    @Test
    public void dataMapTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        connection.data(data);
        assertEquals(2, connection.request().data().size());
    }

    @Test
    public void dataKeyValuesTest() {
        HttpConnection connection = new HttpConnection();
        connection.data("key1", "value1", "key2", "value2");
        assertEquals(2, connection.request().data().size());
    }

    @Test
    public void dataInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        ByteArrayInputStream stream = new ByteArrayInputStream("test stream".getBytes());
        connection.data("key1", "test.txt", stream);
        assertEquals(1, connection.request().data().size());
    }

    @Test
    public void getTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url(new URL("https://google.com"));
        assertNotNull(connection.get());
    }

    @Test
    public void postTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url(new URL("https://google.com"));
        assertNotNull(connection.post());
    }

    @Test
    public void executeTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url(new URL("https://google.com"));
        assertNotNull(connection.execute());
    }

}