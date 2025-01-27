package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void newRequest() {
        // Test that a new request is created correctly
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void url() {
        // Test that the URL method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals(connection.url(), "http://example.com", 0);
    }

    @Test
    public void proxy() {
        // Test that the proxy method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.proxy("localhost:8080"));
    }

    @Test
    public void userAgent() {
        // Test that the userAgent method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.userAgent("Mozilla/5.0"));
    }

    @Test
    public void timeout() {
        // Test that the timeout method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals(connection.timeout(5000), 5000);
    }

    @Test
    public void maxBodySize() {
        // Test that the maxBodySize method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals(connection.maxBodySize(1024), 1024);
    }

    @Test
    public void followRedirects() {
        // Test that the followRedirects method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertTrue(connection.followRedirects(true));
    }

    @Test
    public void referrer() {
        // Test that the referrer method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.referrer("localhost"));
    }

    @Test
    public void method() {
        // Test that the method method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals(connection.method(Connection.Method.GET), Connection.Method.GET);
    }

    @Test
    public void ignoreHttpErrors() {
        // Test that the ignoreHttpErrors method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertTrue(connection.ignoreHttpErrors(true));
    }

    @Test
    public void dataStringKeyValue() {
        // Test that the data method with String key and value returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.data("key", "value"));
    }

    @Test
    public void requestBody() {
        // Test that the requestBody method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.requestBody("Hello, World!"));
    }

    @Test
    public void headerStringNameValue() {
        // Test that the header method with String name and value returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.header("Content-Type", "application/json"));
    }

    @Test
    public void headersMap() {
        // Test that the headers method with Map returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.headers(Collections.singletonMap("key", "value")));
    }

    @Test
    public void cookieStringNameValue() {
        // Test that the cookie method with String name and value returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.cookie("session_id", "123456"));
    }

    @Test
    public void get() throws IOException {
        // Test that the get method returns the correct response
        Connection connection = HttpConnection.connect("http://example.com");
        Document document = connection.get();
        assertNotNull(document);
    }

    @Test
    public void post() throws IOException {
        // Test that the post method returns the correct response
        Connection connection = HttpConnection.connect("http://example.com");
        Document document = connection.post();
        assertNotNull(document);
    }

    @Test
    public void execute() throws IOException {
        // Test that the execute method returns the correct response
        Connection connection = HttpConnection.connect("http://example.com");
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

}