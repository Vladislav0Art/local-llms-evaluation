package org.jsoup.helper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class GeneratedTest_request {

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