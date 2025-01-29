package org.jsoup.helper;

public class GeneratedTest {

    private static final String URL = "http://example.com";
    private static final String COOKIE_NAME = "cookie";

    @Test
    public void testConnect() throws IOException {
        HttpConnection connection = new HttpConnection();
        assertEquals(URL, connection.connect(URL).getUri().toString());
    }

    @Test
    public void testConnectWithProxy() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.setProxy(new Proxy(URI.create("http://example.com:8080"), URI.create("https://example.com")));
        assertEquals("http://example.com:8080", connection.connect(URL).getUri().toString());
    }

    @Test
    public void testConnectWithCookie() throws IOException {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new LinkedHashMap<>();
        cookies.put(COOKIE_NAME, "value");
        connection.setCookies(cookies);
        assertEquals("http://example.com", connection.connect(URL).getUri().toString());
    }

    @Test
    public void testConnectWithCookieStore() throws IOException {
        HttpConnection connection = new HttpConnection();
        CookieManager cookieManager = new CookieManager();
        String cookie = "value";
        cookieManager.addCookie(new java.net.Cookie("name", cookie));
        connection.setCookieStore(cookieManager);
        assertEquals("http://example.com", connection.connect(URL).getUri().toString());
    }

    @Test
    public void testConnectWithParser() throws IOException {
        HttpConnection connection = new HttpConnection();
        Parser parser = new Parser();
        connection.parser(parser);
        assertEquals("http://example.com", connection.get().toString());
    }

    @Test
    public void testConnectWithRequest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        connection.setRequest(request);
        assertEquals(URL, connection.connect(URL).getUri().toString());
    }

    @Test
    public void testConnectWithPostDataCharset() throws IOException {
        HttpConnection connection = new HttpConnection();
        String charset = "utf-8";
        connection.postDataCharset(charset);
        assertEquals("http://example.com", connection.post().toString());
    }

}