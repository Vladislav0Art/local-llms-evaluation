package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    private static final CookieManager COOKIE_MANAGER = new DefaultCookieManager();
    private static final String COOKIE_NAME = "my_cookie";

    public Connection connect(String url) {
        return new Connection(new URL(url), COOKIE_MANAGER);
    }

    @Test
    public void test_connect() {
        Connection connection = HttpConnectionTest.connect("http://example.com");
        assertEquals(null, connection.get());
    }

    @Test
    public void test_connect_with_cookie() throws IOException {
        String cookie = "JSESSIONID=1234567890abcdef; Path=/path";
        CookieManager cookieManager = new DefaultCookieManager();
        cookieManager.setCookies(Collections.singletonMap(COOKIE_NAME, cookie));
        HttpConnection connection = new Connection(new URL("http://example.com"), COOKIE_MANAGER);
        connection.setCookieStore(cookieManager);
        assertEquals(null, connection.get());
    }

    @Test
    public void test_connect_with_proxy() throws IOException {
        String url = "http://example.com";
        Proxy proxy = new InetSocketAddress("192.168.1.100", 8080);
        HttpConnection connection = new Connection(url, null, proxy);
        assertEquals(null, connection.get());
    }

    @Test
    public void test_connect_with_https() throws IOException {
        String url = "https://example.com";
        HttpsURLConnection httpsConnection = (HttpsURLConnection) new Connection(url, null).getResponse();
        assertEquals(443, httpsConnection.getHttpProtocolVersion().toInt());
        assertEquals("UTF-8", HTTPSURLConnection.UTF_8);
    }

    @Test
    public void test_connect_with_max_body_size() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, new InetSocketAddress(8080));
        assertEquals(1024 * 1024 * 10, connection.getMaxBodySize());
    }

    @Test
    public void test_connect_with_ignore_http_errors() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        assertEquals(false, connection.ignoreHttpErrors(true));
        assertEquals(false, connection.ignoreHttpErrors(false));
    }

    @Test
    public void test_get_header() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        Document document = (Document) connection.getResponse();
        assertEquals(200, document.header("Content-Type").toInt());
        assertEquals(443, document.header("X-AuthenticatingProxyServer").toInt());
    }

    @Test
    public void test_post() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        Document document = (Document) connection.getResponse();
        assertEquals(201, document.header("Location").toInt());
        assertEquals(null, document.post().getResponse().header("Content-Type").getFirst());
    }

    @Test
    public void test_execute() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        Document document = (Document) connection.getResponse();
        assertEquals(200, document.header("X-Frame-Options").toInt());
        assertEquals(443, document.header("X-XSS-Protection").toInt());
    }

    @Test
    public void test_connect_request() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        Request request = new Request();
        Document document = (Document) connection.getResponse();
        assertEquals(200, document.header("X-Frame-Options").toInt());
        assertEquals(null, document.request().getResponse());
    }

    @Test
    public void test_get_request() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        Document document = (Document) connection.getResponse();
        assertEquals(200, document.header("X-Frame-Options").toInt());
        assertEquals(null, document.request().getResponse());
    }

    @Test
    public void test_post_request() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        Request request = new Request();
        Document document = (Document) connection.getResponse();
        assertEquals(201, document.header("Location").toInt());
        assertEquals(null, document.post().getResponse());
    }

}