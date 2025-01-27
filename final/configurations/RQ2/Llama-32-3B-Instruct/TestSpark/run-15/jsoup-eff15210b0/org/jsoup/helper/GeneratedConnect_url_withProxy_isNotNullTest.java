package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedConnect_url_withProxy_isNotNullTest {

    @Test
    public void connect_url_withProxy_isNotNullTest() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new SocketAddress("localhost", 8080));
        Document doc = Jsoup.connect("http://example.com", proxy).get();
        assertNotNull(doc);
    }

}