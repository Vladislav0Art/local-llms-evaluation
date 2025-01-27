package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedConnect_url_withUrl_isNotNullTest {

    @Test
    public void connect_url_withUrl_isNotNullTest() {
        String url = "http://example.com";
        Document doc = Jsoup.connect(new java.net.URL(url)).get();
        assert doc != null;
    }
}

class Proxy extends java.net.Proxy {

    private final int port;

    public Proxy(Proxy.Type type, SocketAddress address) {
        super(type, address);
        this.port = address.getPort();
    }

    public static class SocketAddress {
        private final String host;
        private final int port;

        public SocketAddress(String host, int port) {
            this.host = host;
            this.port = port;
        }
    }

    @Override
    public String toString() {
        return "http://localhost:" + port;
    }
}

class URL extends java.net.URL {

    public URL(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "http://example.com";
    }

}