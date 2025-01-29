package org.jsoup.helper;

public class GeneratedTestPostDataCharset {

    @Test
    public void testPostDataCharset() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.postDataCharset("utf-8"));
    }
}

class MockProxy implements Proxy {
    private String host;
    private int port;

    public MockProxy(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public int getPort() {
        return port;
    }
}

class MockHeader implements Header {
    private String name;

    public MockHeader(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return "";
    }

}