package org.jsoup.helper;

public class GeneratedProxyStringIntTest {

    @Test
    public void proxyStringIntTest() throws IOException {
        assertSame(HttpConnection.proxy("example.com", 8080), HttpConnection.connect("https://example.com").proxy("example.com", 8080));
    }

}