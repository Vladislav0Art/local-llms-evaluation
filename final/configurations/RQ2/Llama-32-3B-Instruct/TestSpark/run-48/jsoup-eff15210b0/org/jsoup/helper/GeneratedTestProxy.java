package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestProxy {

    @Test
    public void testProxy() {
        Proxy.Type httpType = Proxy.Type.HTTP;
        InetSocketAddress address = new InetSocketAddress("proxy.example.com", 8080);
        Connection conn = HttpConnection.proxy(httpType, address);
        assertNotNull(conn);
    }

}