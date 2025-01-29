package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    @Test
    public void testIgnoreContentType() throws MalformedURLException, UnknownHostException {
        HttpConnection connection = JsoupHelper.connect("https://example.com");
        assertEquals(connection.ignoreContentType(false), false);
    }

}