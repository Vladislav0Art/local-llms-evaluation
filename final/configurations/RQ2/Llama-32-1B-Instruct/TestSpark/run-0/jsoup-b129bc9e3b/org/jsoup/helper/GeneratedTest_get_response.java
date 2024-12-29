package org.jsoup.helper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class GeneratedTest_get_response {

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
    public void test_get_response() throws URISyntaxException {
        String expected = "HTTP/1.1 200 OK\r\nContent-Type: text/html;\r\n\r\n<html>\r\n<head>\r\n<title>Example</title>\r\n\r\n</head>\r\n<body>\r\nHello, World!\r\n</body>\r\n</html>";
        HttpConnection connection = connect(url);
        Document document = connection.get();
        assert document.body().text().equals(expected);
    }

}