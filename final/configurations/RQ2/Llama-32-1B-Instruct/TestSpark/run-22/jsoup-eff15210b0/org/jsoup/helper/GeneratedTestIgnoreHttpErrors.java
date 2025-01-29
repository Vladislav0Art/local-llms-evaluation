package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrors {

    @Test
    public void testIgnoreHttpErrors() throws MalformedURLException, UnknownHostException {
        HttpConnection connection = JsoupHelper.connect("https://example.com");
        assertEquals(connection.ignoreHttpErrors(true), true);
    }

}