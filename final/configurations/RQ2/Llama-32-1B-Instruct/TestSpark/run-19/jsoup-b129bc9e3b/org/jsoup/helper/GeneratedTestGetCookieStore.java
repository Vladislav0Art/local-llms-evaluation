package org.jsoup.helper;

public class GeneratedTestGetCookieStore {

    private static final String URL = "https://example.com";
    private static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void testGetCookieStore() throws IOException {
        CookieManager cookieManager = new DefaultCookieManager();
        HttpConnection connection = HttpConnection.connect(URL);
        CookieStore cookieStore = connection.getCookieStore();
        assert cookieStore != null;
    }

}