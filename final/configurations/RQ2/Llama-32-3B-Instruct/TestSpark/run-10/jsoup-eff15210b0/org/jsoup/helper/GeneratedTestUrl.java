package org.jsoup.helper;

import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestUrl {

    private String url = "http://www.example.com";
    private Proxy proxy;

    public HttpConnection(String url, Proxy proxy) {
        this.url = url;
        this.proxy = proxy;
    }

    public URL getUrl() {
        return new URL(url);
    }

    public Proxy getProxy() {
        return proxy;
    }
}

public class Proxy {
    private int port;
    private String type;

    public Proxy(int port, String type) {
        this.port = port;
        this.type = type;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proxy proxy = (Proxy) o;
        return port == proxy.port && type.equals(proxy.type);
    }
}

public class Request {
    // Implementation not needed as it's a test, just verifying that the classes are correctly created
}

import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTest {

    private static HttpConnection connection;

    @BeforeClass
    public static void setUpClass() {
        connection = new HttpConnection("http://www.example.com", new Proxy(8080, "HTTP"));
    }

    @Test
    public void testUrl() {
        assertTrue(connection.getUrl().getHost().equals("www.example.com"));
    }

}