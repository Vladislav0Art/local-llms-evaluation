package org.jsoup.helper;

public class GeneratedTestConnectWithCookieStore {

    @Test
    public void testConnectWithCookieStore() throws MalformedURLException {
        MockHttpConnection connection = new MockHttpConnection();
        URL url = new URL("https://example.com?cookieStore=mock");
        assertEquals("https://example.com", connection.connect(url));
    }

}