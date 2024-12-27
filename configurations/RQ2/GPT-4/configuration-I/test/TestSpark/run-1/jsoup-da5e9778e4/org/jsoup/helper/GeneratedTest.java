package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private final String TEST_URL = "https://httpbin.org/html";

    // Test default constructor

    @Test
    public void httpConnectionDefaultConstructorTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertNotNull(httpConnection);
    }

    @Test
    public void connectClassInstanceTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL(TEST_URL));
        assertNotNull(connection);
    }

    @Test
    public void connectUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(TEST_URL);
        assertNotNull(connection);
    }

    @Test
    public void timeoutTest() {
        Connection connection = Jsoup.connect(TEST_URL).timeout(5000);
        assertEquals(5000, connection.request().timeout());
    }

    @Test
    public void headerTest() {
        Connection connection = Jsoup.connect(TEST_URL).header("Accept-Language", "en");
        assertEquals("en", connection.request().header("Accept-Language"));
    }

    @Test
    public void cookieTest() {
        Connection connection = Jsoup.connect(TEST_URL).cookie("sessionid", "12345");
        assertEquals("12345", connection.request().cookie("sessionid"));
    }

    @Test
    public void headersTest() {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Accept-Language", "en");
        Connection connection = Jsoup.connect(TEST_URL).headers(headers);
        assertEquals("en", connection.request().header("Accept-Language"));
    }

    @Test
    public void postTest() throws IOException {
        Document doc = Jsoup.connect(TEST_URL).post();
        assertNotNull(doc);
    }

    @Test
    public void getTest() throws IOException {
        Document doc = Jsoup.connect(TEST_URL).get();
        assertNotNull(doc);
    }

}