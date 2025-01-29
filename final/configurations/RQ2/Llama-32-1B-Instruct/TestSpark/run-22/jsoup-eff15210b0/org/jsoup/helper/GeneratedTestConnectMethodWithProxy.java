package org.jsoup.helper;

public class GeneratedTestConnectMethodWithProxy {

    @Test
    public void testConnectMethodWithProxy() throws MalformedURLException, UnknownHostException {
        URL url = new URL("https://proxy.example.com");
        HttpConnection connection = JsoupHelper.connect(url);
        assertEquals(connection, JsoupHelper.connect(new org.jsoup.parser.Parser(), "https://proxy.example.com"));
    }

}