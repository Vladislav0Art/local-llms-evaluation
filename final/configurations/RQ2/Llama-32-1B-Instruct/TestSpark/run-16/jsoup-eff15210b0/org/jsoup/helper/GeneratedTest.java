package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void testConnect() {
        String url = "https://www.example.com";
        HttpConnection connection = HttpConnection.connect(url);
        assertEquals("https://www.example.com", connection.url());
    }

    @Test
    public void testProxy() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setProxy(new org.jsoup.parser.Proxy(url));
        String actualUrl = connection.proxy(url);
        assertEquals("https://proxy.example.com", actualUrl);
    }

    @Test
    public void testUserAgent() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.37");
        String actualUrl = connection.url(url);
        assertEquals("https://www.example.com", actualUrl);
    }

    @Test
    public void testTimeout() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setTimeout(1000); // 1 second
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(-1, connection.timeout(1000));
    }

    @Test
    public void testMaxBodySize() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setMaxBodySize(1024 * 10); // 10 KB
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(-1, connection.maxBodySize(1024 * 20));
    }

    @Test
    public void testFollowRedirects() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setFollowRedirects(true);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, connection.followRedirects());
    }

    @Test
    public void testIgnoreHttpErrors() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setIgnoreHttpErrors(true);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, connection.ignoreHttpErrors());
    }

    @Test
    public void testIgnoreContentType() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setIgnoreContentType(true);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, connection.ignoreContentType());
    }

    @Test
    public void testData() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        String[] data = {"key1", "value1"};
        connection.setData(data);
        assertEquals("key1=value1", connection.data("key1"));
    }

    @Test
    public void testDataWithFilename() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        String[] data = {"key1", "value1"};
        connection.setData(data, "filename.txt");
        assertEquals("key1=value1", connection.data("key1"));
    }

    @Test
    public void testDataWithContentType() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        String[] data = {"key1", "value1"};
        connection.setData(data, "application/x-www-form-urlencoded");
        assertEquals("key1=value1", connection.data("key1"));
    }

    @Test
    public void testRequest() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        Connection.Request request = new Connection.Request(url);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals("https://www.example.com", connection.request());
    }

    @Test
    public void testRequestWithConnection() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        Connection.Request request = new Connection.Request(url);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals("https://www.example.com", connection.request(request));
    }

    @Test
    public void testResponse() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        Connection.Response response = new Connection.Response(url);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals("https://www.example.com", connection.response());
    }

    @Test
    public void testResponseWithConnection() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        Connection.Response response = new Connection.Response(url);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals("https://www.example.com", connection.response(response));
    }

    @Test
    public void testPostData() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        Connection.Request request = new Connection.Request(url);
        String[] data = {"key1", "value1"};
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals("key1=value1", connection.request(request).postDataCharset("UTF-8"));
    }

    @Test
    public void testPostDataWithFilename() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        Connection.Request request = new Connection.Request(url);
        String[] data = {"key1", "value1"};
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals("key1=value1", connection.request(request).postDataCharset("UTF-8"));
    }

}