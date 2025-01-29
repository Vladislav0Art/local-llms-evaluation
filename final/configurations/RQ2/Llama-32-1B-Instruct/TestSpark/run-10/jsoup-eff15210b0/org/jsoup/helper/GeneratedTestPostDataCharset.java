package org.jsoup.helper;

public class GeneratedTestPostDataCharset {

    @Test
    public void testPostDataCharset() {
        Request request = new Request();
        request.getHeaders().add(new CookieManager().addCookie(new SessionCookieStore().getSession("session_id")));
        Connection connection = org.jsoup.helper.HttpConnection.connect(request);
        assertEquals(null, connection.getURL());
    }

}