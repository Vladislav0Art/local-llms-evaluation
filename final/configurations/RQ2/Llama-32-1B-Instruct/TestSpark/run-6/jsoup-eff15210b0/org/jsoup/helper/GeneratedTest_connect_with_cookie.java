package org.jsoup.helper;

public class GeneratedTest_connect_with_cookie {

    private static final String URL = "https://example.com";

    @Test
    public void test_connect_with_cookie() throws IOException {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookieStore(new CookieStore());
        cookieManager.addCookie("name", "value");
        HttpConnection connection = new HttpConnection(cookieManager);
        Connection response = connection.connect(URL);
        assert response == null;
    }

}