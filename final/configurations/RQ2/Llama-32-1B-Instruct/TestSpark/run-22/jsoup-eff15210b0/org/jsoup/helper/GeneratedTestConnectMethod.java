package org.jsoup.helper;

public class GeneratedTestConnectMethod {

    @Test
    public void testConnectMethod() throws MalformedURLException, UnknownHostException {
        URL url = new URL("https://example.com");
        HttpConnection connection = JsoupHelper.connect(url);
        assertEquals(connection, JsoupHelper.connect("https://example.com"));
    }

}