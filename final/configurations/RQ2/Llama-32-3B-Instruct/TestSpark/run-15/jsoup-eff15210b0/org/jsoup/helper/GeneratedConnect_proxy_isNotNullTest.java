package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedConnect_proxy_isNotNullTest {

    @Test
    public void connect_proxy_isNotNullTest() {
        java.net.Proxy proxy = new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.SocketAddress("localhost", 8080));
        Document doc = Jsoup.connect("http://example.com", proxy).get();
        assert doc != null;
    }

}