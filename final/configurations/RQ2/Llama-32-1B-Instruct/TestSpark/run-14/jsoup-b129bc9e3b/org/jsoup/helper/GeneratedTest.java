package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testConnect() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        assertEquals(url, connection.connect(url));
        assertTrue(connection != null);
    }

    @Test
    public void testConnectUrl() {
        URI uri = new URI("https://www.example.com");
        HttpConnection connection = new HttpConnection(uri);
        assertEquals(uri.getScheme(), connection.get().getScheme());
        assertEquals(uri.getHost(), connection.get().getHost());
        assertTrue(connection != null);
    }

    @Test
    public void testConnectProxy() {
        String host = "example.com";
        int port = 443;
        Proxy proxy = new org.jsoup.parser.Parser().parse(new java.net.InetSocketAddress(host, port));
        HttpConnection connection = new HttpConnection(proxy);
        assertEquals(proxy.getScheme(), connection.get().getScheme());
        assertEquals(proxy.getHost(), connection.get().getHost());
    }

    @Test
    public void testConnectProxyUrl() {
        URI uri = new URI("https://www.example.com");
        HttpConnection connection = new HttpConnection(uri);
        assertEquals(proxy.getScheme(), connection.get().getScheme());
        assertEquals(proxy.getHost(), connection.get().getHost());
    }

    @Test
    public void testConnectUserAgent() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
        HttpConnection connection = new HttpConnection();
        assertEquals(userAgent, connection.getUserAgent());
    }

    @Test
    public void testConnectTimeout() {
        int timeout = 1000;
        HttpConnection connection = new HttpConnection(timeout);
        assertTrue(connection.timeout(timeout) == true);
        assertFalse(connection.timeout(timeout) == false);
    }

    @Test
    public void testConnectMaxBodySize() {
        int maxSizeBytes = 1024;
        HttpConnection connection = new HttpConnection(maxSizeBytes);
        assertEquals(maxSizeBytes, connection.maxBodySize(maxSizeBytes));
    }

    @Test
    public void testConnectFollowRedirects() {
        boolean followRedirects = true;
        HttpConnection connection = new HttpConnection(followRedirects);
        assertTrue(connection.followRedirects(followRedirects) == true);
        assertFalse(connection.followRedirects(followRedirects) == false);
    }

    @Test
    public void testConnectReferrer() {
        String referrer = "https://www.example.com";
        HttpConnection connection = new HttpConnection(referrer);
        assertEquals(referrer, connection.referrer());
    }

    @Test
    public void testConnectMethod() {
        Method method = HEAD;
        HttpConnection connection = new HttpConnection(method);
        assertEquals(HEAD, connection.method(method));
    }

    @Test
    public void testConnectIgnoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        HttpConnection connection = new HttpConnection(ignoreHttpErrors(ignoreHttpErrors));
        assertTrue(connection.ignoreHttpErrors(ignoreHttpErrors) == true);
        assertFalse(connection.ignoreHttpErrors(ignoreHttpErrors) == false);
    }

    @Test
    public void testConnectIgnoreContentType() {
        boolean ignoreContentType = false;
        HttpConnection connection = new HttpConnection(ignoreContentType(ignoreContentType));
        assertEquals(ignoreContentType, connection.ignoreContentType(ignoreContentType));
    }

    @Test
    public void testConnectData() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Map<String, String> headers = new HashMap<>();
        headers.put("header", "value");
        HttpConnection connection = new HttpConnection(data, headers);
        assertEquals(data, connection.data("key"));
    }

    @Test
    public void testConnectPostData() {
        String body = "This is a sample response.";
        Map<String, String> headers = new HashMap<>();
        headers.put("header", "value");
        HttpConnection connection = new HttpConnection(headers);
        assertEquals(body, connection.requestbody("POST", "", body));
    }

    @Test
    public void testConnectCookies() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("test1", "value1");
        cookies.put("test2", "value2");
        assertEquals(cookies, connection.cookies());
    }

}