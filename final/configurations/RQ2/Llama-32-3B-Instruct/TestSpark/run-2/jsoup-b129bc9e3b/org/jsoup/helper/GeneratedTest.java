package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedTest {

    @Test
    public void connect_SimpleConnect_ReturnsConnection() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connect_URLConnect_ReturnsConnection() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void connect_MalformedURLConnect_ThrowsMalformedURLException() {
        URL url = new URL(null);
        HttpConnection.connect(url);
    }

    @Test
    public void url_StringUrl_ReturnsConnection() {
        Connection connection = HttpConnection.url("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void url_URLUrl_ReturnsConnection() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
    }

    @Test
    public void proxy_ProxyReturnsWithProxy() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 80));
        Connection connection = HttpConnection.proxy(proxy);
        assertNotNull(connection);
    }

    @Test
    public void proxy_StringHost_ReturnsConnectionWithProxy() {
        String host = "example.com";
        int port = 80;
        Connection connection = HttpConnection.proxy(host, port);
        assertNotNull(connection);
    }

    @Test
    public void userAgent_StringUserAgent_ReturnsConnectionWithUserAgent() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertNotNull(connection);
    }

    @Test
    public void timeout_IntegerTimeoutReturnsWithTimeout() {
        int millis = 1000;
        Connection connection = HttpConnection.timeout(millis);
        assertNotNull(connection);
    }

    @Test
    public void maxBodySize_IntegerMaxBytesReturnsWithMaxBodySize() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assertNotNull(connection);
    }

    @Test
    public void followRedirects_BoolFollowRedirects_ReturnsConnectionWithFollowRedirects() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertNotNull(connection);
    }

    @Test
    public void referrer_StringReferrer_ReturnsConnectionWithReferrer() {
        String referrer = "http://example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assertNotNull(connection);
    }

    @Test
    public void method_MethodMethodReturnsWithMethod() {
        Method method = Method.POST;
        Connection connection = HttpConnection.method(method);
        assertNotNull(connection);
    }

    @Test
    public void ignoreHttpErrors_BoolIgnoreHttpErrors_ReturnsConnectionWithIgnoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertNotNull(connection);
    }

    @Test
    public void ignoreContentType_BoolIgnoreContentType_ReturnsConnectionWithIgnoreContentType() {
        boolean ignoreContentType = true;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assertNotNull(connection);
    }

    @Test
    public void data_StringKeyReturnsWithData() {
        String key = "key";
        Connection connection = HttpConnection.data(key);
        assertNotNull(connection);
    }

    @Test
    public void data_StringFilenameInputStreamReturnsWithData() {
        String filename = "filename";
        InputStream inputStream = new ByteArrayInputStream(new byte[]{0});
        Connection connection = HttpConnection.data(filename, inputStream);
        assertNotNull(connection);
    }

    @Test
    public void data_StringKeyMapReturnsWithData() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Connection connection = HttpConnection.data(map);
        assertNotNull(connection);
    }

    @Test
    public void request_ReturnsRequest() {
        Connection.Request request = new Connection.Request();
        Connection connection = HttpConnection.request(request);
        assertNotNull(connection);
    }

    @Test
    public void execute_ThrowsIOException() {
        try {
            Connection response = HttpConnection.execute();
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void get_ReturnsDocument() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Document document = connection.get();
        assertNotNull(document);
    }

    @Test
    public void post_ReturnsDocument() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Document document = connection.post();
        assertNotNull(document);
    }

}