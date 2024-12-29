package org.jsoup.helper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class GeneratedTest_cookies {

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
    public void test_cookies() throws URISyntaxException {
        CookieStore cookieStore = CookieManager.get().getCookieStore();
        HttpConnection connection = connect(url);
        assert connection.cookies(cookieStore);

        Request request = new Request("key", "value");
        HttpConnection response = connect(Request.copy(request));
        assert response.cookies(cookieStore).containsKey("cookie_name");
    }

}