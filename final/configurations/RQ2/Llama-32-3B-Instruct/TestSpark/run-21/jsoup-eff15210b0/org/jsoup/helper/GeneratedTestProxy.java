package org.jsoup.helper;

public class GeneratedTestProxy {

    private final String host;
    private final int port;

    public URL(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        URL url = (URL) o;
        return port == url.port && host.equals(url.host);
    }

    @Override
    public int hashCode() {
        return 31 * host.hashCode() + port;
    }
}

public class HttpConnection {
    public Connection connect(String url, String proxy) {
        // implementation
        return null;
    }

    public Connection connect(URL url, String userAgent) {
        // implementation
        return null;
    }

    public Connection url(String url) {
        // implementation
        return null;
    }

    public Connection url(URL url, String userAgent) {
        // implementation
        return null;
    }

    public Proxy proxy(String proxy) {
        // implementation
        return null;
    }
}

public class GeneratedTest {
    @Mockito.Mocked
    private HttpConnection connectionMock;

    @Test
    public void testProxy() throws Exception {
        String proxy = "http://proxy.example.com";
        Proxy proxyImpl = new MyProxy(proxy);
        Connection newRequest = connectionMock.proxy(proxyImpl);
        // implementation
    }
}

public class MyProxy implements Proxy {
    private final String url;

    public MyProxy(String url) {
        this.url = url;
    }

    @Override
    public void connect() {
        // implementation
    }

}