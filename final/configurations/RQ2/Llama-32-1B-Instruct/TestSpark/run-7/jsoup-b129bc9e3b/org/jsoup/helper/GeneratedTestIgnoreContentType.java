package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    @Test
    public void testIgnoreContentType() {
        HttpConnection connection = HttpConnection.connect("http://example.com?content-type=application/json");
        assertEquals(8, connection.getCookieManager().getCookieCount());
    }

}