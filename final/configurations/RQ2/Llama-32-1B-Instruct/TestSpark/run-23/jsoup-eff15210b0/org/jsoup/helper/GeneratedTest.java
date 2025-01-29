package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTest {

    private String url = "http://example.com";

    @Test
    public void testConnect() {
        HttpConnection connection = new HttpConnection();
        connection.connect(url);
        assertEquals("http://example.com", connection.getUrl());
    }

    @Test
    public void testProxy() {
        HttpConnection connection = new HttpConnection(new Proxy("localhost", 8080));
        connection.proxy(null); // no proxy provided
        assertEquals("https://localhost:8080", connection.getHttpUrl());
    }

    @Test
    public void testUserAgent() {
        HttpConnection connection = new HttpConnection();
        String userAgent = "My User Agent";
        connection.userAgent(userAgent);
        assertEquals(userAgent, connection.getUserAgent());
    }

    @Test
    public void testTimeout() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(1000); // 1 second timeout
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(0, connection.getTimeoutMillis());
    }

    @Test
    public void testMaxBodySize() {
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(1024); // 1KB max body size
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1024, connection.getMaxRequestBodySize());
    }

    @Test
    public void testFollowRedirects() {
        HttpConnection connection = new HttpConnection();
        connection.followRedirects(true); // follow redirects
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(2, connection.getFollowRedirects());
    }

    @Test
    public void testReferrer() {
        HttpConnection connection = new HttpConnection();
        String referrer = "https://example.com";
        connection.referrer(referrer); // set referrer
        assertEquals("https://example.com", connection.getRequest().getHttpUrl());
    }

    @Test
    public void testIgnoreHttpErrors() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreHttpErrors(false); // ignore HTTP errors
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(0, connection.getTimeoutMillis());
    }

    @Test
    public void testIgnoreContentType() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreContentType(false); // ignore content type
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(0, connection.getTimeoutMillis());
    }

    @Test
    public void testData() {
        HttpConnection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        connection.data(key, value); // data method
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDataWithFilename() {
        HttpConnection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        String filename = "filename.txt";
        connection.data(key, value, filename); // data method with filename
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDataWithContentType() {
        HttpConnection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        String contentType = "text/plain";
        connection.data(key, value, contentType); // data method with content type
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDataWithMap() {
        HttpConnection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        Map<String, String> data = new LinkedHashMap<>();
        data.put("name", "John");
        data.put("age", "30");
        connection.data(key, value, data); // data method with map
    }

    @Test
    public void testPostDataCharset() {
        HttpConnection connection = new HttpConnection();
        String charset = "UTF-8";
        connection.postDataCharset(charset); // post data charset
    }

}