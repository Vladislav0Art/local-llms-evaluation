package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() {
        HttpConnection connection = HttpConnection.connect("http://proxy.example.com", new Proxy("http://localhost:8080", null));
        assertNotNull(connection);
    }

}