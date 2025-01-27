package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void connect_StringUrl_ReturnsHttpConnection() {
        Connection connection = HttpConnection.connect("https://www.example.com");
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void connect_URL_ThrowsIOException() {
        try {
            URL url = new URL("https://www.example.com");
            HttpConnection.connect(url);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void newRequest_ReturnsHttpConnection() {
        Connection connection = HttpConnection.newRequest();
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void url_StringUrl_ReturnsHttpConnection() {
        Connection connection = HttpConnection.url("https://www.example.com");
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void url_URL_ReturnsHttpConnection() {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.url(url);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void proxy_NullProxy_ReturnsHttpConnection() {
        Connection connection = HttpConnection.proxy(null);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void proxy_StringHostAndPort_ReturnsHttpConnection() {
        Connection connection = HttpConnection.proxy("example.com", 8080);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void userAgent_EmptyString_ThrowsNullPointerException() {
        try {
            String userAgent = "";
            HttpConnection.userAgent(userAgent);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void timeout_NegativeValue_ThrowsIllegalArgumentException() {
        try {
            int millis = -1;
            HttpConnection.timeout(millis);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void maxBodySize_NegativeValue_ThrowsIllegalArgumentException() {
        try {
            int bytes = -1;
            HttpConnection.maxBodySize(bytes);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void data_NullKey_ThrowsNullPointerException() {
        try {
            String key = null;
            HttpConnection.data(key, "value", new ByteArrayInputStream(new byte[0]));
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void headers_NullMap_ThrowsNullPointerException() {
        try {
            Map<String, String> headers = null;
            HttpConnection.headers(headers);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void cookies_NullMap_ThrowsNullPointerException() {
        try {
            Map<String, String> cookies = null;
            HttpConnection.cookies(cookies);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void get_ReturnsDocument() throws IOException {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.connect(url);
        Document document = connection.get();
        assertNotNull(document);
    }

    @Test
    public void post_ReturnsDocument() throws IOException {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.connect(url);
        Document document = connection.post();
        assertNotNull(document);
    }

    @Test
    public void execute_ReturnsResponse() throws IOException {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.connect(url);
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

}