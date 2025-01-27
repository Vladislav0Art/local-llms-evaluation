package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void connectUrl_Test() {
        // arrange
        String url = "http://example.com";
        // act
        Connection connection = HttpConnection.connect(url);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void connectString_Test() {
        // arrange
        String url = "http://example.com";
        // act
        Connection connection = HttpConnection.connect(url);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void url_Test() {
        // arrange
        URL url = new URL("http://example.com");
        // act
        Connection connection = HttpConnection.url(url);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void urlString_Test() {
        // arrange
        String url = "http://example.com";
        // act
        Connection connection = HttpConnection.url(url);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void proxy_Test() {
        // arrange
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy", 8080));
        // act
        Connection connection = HttpConnection.proxy(proxy);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void userAgent_Test() {
        // arrange
        String userAgent = "Mozilla/5.0";
        // act
        Connection connection = HttpConnection.userAgent(userAgent);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void timeout_Test() {
        // arrange
        int millis = 500;
        // act
        Connection connection = HttpConnection.timeout(millis);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void dataMap_Test() {
        // arrange
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        // act
        Connection connection = HttpConnection.data(data);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void dataStringValue_Test() {
        // arrange
        String key = "key";
        String value = "value";
        // act
        Connection connection = HttpConnection.data(key, value);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void requestBody_Test() {
        // arrange
        String body = "Hello World!";
        // act
        Connection connection = HttpConnection.requestBody(body);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void headersMap_Test() {
        // arrange
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("Content-Type", "application/json");
        // act
        Connection connection = HttpConnection.headers(headers);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void cookieNameValue_Test() {
        // arrange
        String name = "cookie";
        String value = "value";
        // act
        Connection connection = HttpConnection.cookie(name, value);
        // assert
        assertNotNull(connection);
    }

    @Test
    public void executePost_Test() throws IOException {
        // arrange
        URL url = new URL("http://example.com");
        // act
        Document document = HttpConnection.post().execute();
        // assert
        assertNotNull(document);
    }

}