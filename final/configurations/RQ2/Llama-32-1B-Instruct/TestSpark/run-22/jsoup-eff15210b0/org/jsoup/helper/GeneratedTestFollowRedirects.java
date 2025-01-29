package org.jsoup.helper;

public class GeneratedTestFollowRedirects {

    @Test
    public void testFollowRedirects() throws MalformedURLException, UnknownHostException {
        HttpConnection connection = JsoupHelper.connect("https://example.com");
        assertEquals(connection.followRedirects(true), true);
    }

}