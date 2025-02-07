package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testConnect() {
        String url = "http://example.com";
        HttpConnection connection = HttpConnection.connect(url);
        assertEquals("http://example.com", connection.get().getURI());
    }

    @Test
    public void testProxy() {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setProxy(new org.jsoup_proxy.Proxy(new InetSocketAddress("localhost", 8080)));
        assertEquals("http://localhost:8080", connection.get().getURI());
    }

    @Test
    public void testUserAgent() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setUserAgent("Example User Agent");
        assertEquals("Example User Agent", connection.get().getUserAgent());
    }

    @Test
    public void testTimeout() {
        int millis = 1000;
        Connection response = HttpConnection.connect("http://example.com").execute(1000);
        assertEquals(200, response.getResponseCode());
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Test
    public void testMaxBodySize() {
        int bytes = 1024;
        Connection response = HttpConnection.connect("http://example.com").execute(1024);
        assertEquals(200, response.getResponseCode());
        try {
            Thread.sleep(bytes);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Test
    public void testFollowRedirects() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setFollowRedirects(true);
        Connection response = HttpConnection.connect(url).execute();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testReferrer() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setReferrer("http://other.example.com");
        assertEquals("http://other.example.com", connection.get().getRedirectUri());
    }

    @Test
    public void testIgnoreHttpErrors() {
        Connection response = HttpConnection.connect("https://example.com").execute(1000);
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testIgnoreContentType() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setIgnoreContentType(true);
        Connection response = HttpConnection.connect(url).execute();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testDataRequest() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").execute();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testDataPost() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").post().execute();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testDataResponse() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").execute().getResponse();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testDataPostBody() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").post().execute();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testDataResponseBody() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").execute().getResponse();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testPostDataCharset() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.postCharset("utf-8").execute();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testDataCharset() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").execute();
        assertEquals(200, response.getResponseCode());
    }

    @Test
    public void testPostDataCharsetResponse() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.postCharset("utf-8").post().execute();
        assertEquals(200, response.getResponseCode());
    }

}