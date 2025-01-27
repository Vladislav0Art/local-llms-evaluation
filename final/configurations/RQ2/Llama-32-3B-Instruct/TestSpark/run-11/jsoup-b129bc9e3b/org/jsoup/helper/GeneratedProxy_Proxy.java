package org.jsoup.helper;

public class GeneratedProxy_Proxy {

    @Test
    public void proxy_Proxy() {
        assertSame(HttpConnection.class, Connection.proxy(new Proxy("host", 8080)));
    }

}