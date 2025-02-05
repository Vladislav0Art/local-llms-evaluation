package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.jsoup.Connection.Method;
import org.junit.Test;
import org.mockito.Matchers;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

public class GeneratedTest {

    private static final String TEST_URL = "http://example.com";

    @Test
    public void connectWithStringUrlTest() throws Exception {
        assertNotNull(HttpConnection.connect(TEST_URL));
    }

    @Test
    public void connectWithUrlTest() throws Exception {
        URL url = new URL(TEST_URL);
        assertNotNull(HttpConnection.connect(url));
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.newRequest());
    }

    @Test
    public void urlWithStringTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.url(TEST_URL));
    }

    @Test
    public void urlWithUrlTest() throws Exception {
        URL url = new URL(TEST_URL);
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.url(url));
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.userAgent("User-Agent"));
    }

    @Test
    public void dataTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.data("Key", "Value"));
    }

    @Test
    public void dataWithStreamTest() {
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[10]);
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.data("Key", "fileName", stream));
    }

    @Test
    public void dataWithStreamAndTypeTest() {
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[10]);
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.data("Key", "fileName", stream, "image/jpg"));
    }

    @Test
    public void dataWithMapTest() {
        Map<String, String> dataMap = new LinkedHashMap<>();
        dataMap.put("Key1", "Value1");
        dataMap.put("Key2", "Value2");
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.data(dataMap));
    }

    @Test
    public void headerTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.header("HeaderName", "HeaderValue"));
    }

    @Test
    public void executeTest() throws Exception {
        HttpConnection connection = (HttpConnection) HttpConnection.connect(TEST_URL);
        assertNotNull(connection.execute());
    }

    @Test
    public void requestTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.request());
    }

    @Test
    public void responseTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.response());
    }

    @Test
    public void postTest() throws Exception {
        HttpConnection connection = (HttpConnection) HttpConnection.connect(TEST_URL);
        assertNotNull(connection.post());
    }

    @Test
    public void getTest() throws Exception {
        HttpConnection connection = (HttpConnection) HttpConnection.connect(TEST_URL);
        assertNotNull(connection.get());
    }

}