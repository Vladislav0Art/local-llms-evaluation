package org.jsoup.helper;

public class GeneratedTestProxy {

    @Test
    public void testProxy() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = new CustomProxy(); // implementation
        connection = connection.proxy(proxy);
        assertEquals(proxy, connection.getProxy());
    }

}