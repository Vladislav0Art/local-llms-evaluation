package org.jsoup.helper;

public class GeneratedTestCookieStore {

    @Test
    public void testCookieStore() throws IOException {
        CookieManager manager = new CookieManager();
        HttpConnection connection = (HttpConnection) HttpConnection.connect("https://example.com");
        manager.getCookieStore().setCookies(new java.util.ArrayList<>());
        assertEquals(200, connection.getResponseCode());
    }

}