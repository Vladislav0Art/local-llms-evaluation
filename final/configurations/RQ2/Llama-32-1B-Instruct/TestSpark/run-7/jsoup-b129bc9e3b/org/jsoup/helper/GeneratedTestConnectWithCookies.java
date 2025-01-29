package org.jsoup.helper;

public class GeneratedTestConnectWithCookies {

    @Test
    public void testConnectWithCookies() {
        HttpConnection connection = HttpConnection.connect("http://example.com?cookie=foo");
        assertEquals(8, connection.getCookieManager().getCookieCount());
    }

}