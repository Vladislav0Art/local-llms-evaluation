package org.jsoup.helper;

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() throws MalformedURLException {
        assertSame(HttpConnection.connect("https://example.com"), HttpConnection.connect(new URL("https://example.com")));
    }

}