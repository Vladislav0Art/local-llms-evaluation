package org.jsoup.helper;

public class GeneratedTestConnectMethodWithUserAgent {

    @Test
    public void testConnectMethodWithUserAgent() throws MalformedURLException, UnknownHostException {
        URL url = new URL("https://example.com");
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
        HttpConnection connection = JsoupHelper.connect(url, userAgent);
        assertEquals(connection, JsoupHelper.connect("https://example.com", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3"));
    }

}