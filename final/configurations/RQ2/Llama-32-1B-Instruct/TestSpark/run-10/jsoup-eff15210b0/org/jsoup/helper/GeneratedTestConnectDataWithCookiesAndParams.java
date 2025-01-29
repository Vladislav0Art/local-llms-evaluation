package org.jsoup.helper;

public class GeneratedTestConnectDataWithCookiesAndParams {

    @Test
    public void testConnectDataWithCookiesAndParams() {
        Request request = new Request();
        request.getHeaders().add(new CookieManager().addCookie(new SessionCookieStore().getSession("session_id")));
        Connection connection = org.jsoup.helper.HttpConnection.connect(request);
        assertEquals("http://example.com?session_id=1&param=value", connection.getURL());
    }

}