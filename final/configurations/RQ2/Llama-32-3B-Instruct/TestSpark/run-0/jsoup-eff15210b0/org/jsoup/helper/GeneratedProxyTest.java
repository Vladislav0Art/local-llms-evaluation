package org.jsoup.helper;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        Connection conn = HttpConnection.connect("https://example.com").proxy(new Proxy(Proxy.Type.HTTP, 8080));
        assertNotNull(conn);
        assertTrue(conn.isProxy());
    }

}