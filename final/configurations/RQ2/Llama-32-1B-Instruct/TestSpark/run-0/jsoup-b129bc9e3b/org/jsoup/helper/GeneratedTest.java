package org.jsoup.helper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class GeneratedTest {

    private String url;
    private Document document;
    private Request request;
    private CookieStore cookieStore;
    private Parser parser;
    private SSLSocketFactory sslSocketFactory;

    public HttpConnection(String url) throws URISyntaxException {
        this.url = new URI(url).toString();
        this.document = null;
    }

    @Test
    public void test_connect_url() {
        try {
            HttpConnection connection = connect(url);
            assert connection != null;
        } catch (URISyntaxException e) {
            fail("Unexpected error");
        }
    }

    @Test
    public void test_connect_request() throws IOException {
        Request request = new Request();
        HttpConnection connection = connect(Request.copy(request));
        assert connection.request() == request;
    }

    @Test
    public void test_proxy() throws URISyntaxException {
        URL url = new URI("http://example.com");
        CookieStore cookieStore = CookieManager.get().getCookieStore();
        Parser parser = Parser.from(new URI(url).toString());
        HttpConnection connection = connect(url);
        assert connection.proxy(Proxy.create(new InetSocketAddress(url.getHost(), url.getPort())));

        Request request = request();
        try {
            String body = new String(() -> "Hello, World!");
            HttpConnection response = connect(Request.copy(request));
            assert response.data("key", "value").body().contentEquals(body);
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void test_parser() throws IOException {
        CookieStore cookieStore = CookieManager.get().getCookieStore();
        Parser parser = Parser.from(new URI(url).toString());
        HttpConnection connection = connect(url);
        assert connection.parser(parser);

        Request request = new Request("key", "value");
        HttpConnection response = connect(Request.copy(request));
        assert response.data("key", "value").body().contentEquals("Hello, World!");
    }

    @Test
    public void test_ssl_socket_factory() throws URISyntaxException {
        SSLSocketFactory factory = SSLSocketFactory.getDefault();
        HttpConnection connection = connect(url);
        assert connection.sslSocketFactory(factory);

        Request request = new Request("key", "value");
        HttpConnection response = connect(Request.copy(request));
        assert response.data("key", "value").body().contentEquals("Hello, World!");
    }

    @Test
    public void test_cookies() throws URISyntaxException {
        CookieStore cookieStore = CookieManager.get().getCookieStore();
        HttpConnection connection = connect(url);
        assert connection.cookies(cookieStore);

        Request request = new Request("key", "value");
        HttpConnection response = connect(Request.copy(request));
        assert response.cookies(cookieStore).containsKey("cookie_name");
    }

    @Test
    public void test_headers() throws URISyntaxException {
        CookieStore cookieStore = CookieManager.get().getCookieStore();
        Parser parser = Parser.from(new URI(url).toString());
        HttpConnection connection = connect(url);
        assert connection.headers(Map.of("key", "value"));

        Request request = new Request("key", "value");
        HttpConnection response = connect(Request.copy(request));
        assert response.data("key", "value").body().contentEquals("Hello, World!");
    }

    @Test
    public void test_cookie_store() throws URISyntaxException {
        CookieStore cookieStore = CookieManager.get().getCookieStore();
        HttpConnection connection = connect(url);
        assert connection.cookieStore(cookieStore);

        Request request = new Request("key", "value");
        HttpConnection response = connect(Request.copy(request));
        assert response.data("key", "value").body().contentEquals("Hello, World!");
    }

    @Test
    public void test_post_data() throws URISyntaxException {
        CookieStore cookieStore = CookieManager.get().getCookieStore();
        Parser parser = Parser.from(new URI(url).toString());
        HttpConnection connection = connect(url);
        assert connection.postDataCharset("UTF-8");

        Request request = new Request("key", "value");
        HttpConnection response = connect(Request.copy(request));
        assert response.data("key", "value").body().contentEquals("Hello, World!");
    }

    @Test
    public void test_get_response() throws URISyntaxException {
        String expected = "HTTP/1.1 200 OK\r\nContent-Type: text/html;\r\n\r\n<html>\r\n<head>\r\n<title>Example</title>\r\n\r\n</head>\r\n<body>\r\nHello, World!\r\n</body>\r\n</html>";
        HttpConnection connection = connect(url);
        Document document = connection.get();
        assert document.body().text().equals(expected);
    }

    @Test
    public void test_response() throws URISyntaxException {
        String expected = "HTTP/1.1 200 OK\r\nContent-Type: text/html;\r\n\r\n<html>\r\n<head>\r\n<title>Example</title>\r\n\r\n</head>\r\n<body>\r\nHello, World!\r\n</body>\r\n</html>";
        HttpConnection connection = connect(url);
        Document document = new Document();
        document.toString().equals(expected);
    }

    @Test
    public void test_request() throws IOException {
        String expected = "HTTP/1.1 200 OK\r\nContent-Type: text/html;\r\n\r\n<html>\r\n<head>\r\n<title>Example</title>\r\n\r\n</head>\r\n<body>\r\nHello, World!\r\n</body>\r\n</html>";
        HttpConnection connection = connect(url);
        Request request = new Request("key", "value");
        Document document = connection.request().body();
        assert document.toString().equals(expected);
    }
}

class Request {
    private String key;
    private String value;

    public static Request copy(Request request) {
        return new Request(request.key, request.value);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Document extends DomElement {
    @Override
    public String toString() {
        return "Document{" +
                "body=" + super.toString() +
                '}';
    }

}