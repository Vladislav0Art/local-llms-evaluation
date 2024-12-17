package org.jsoup.helper;

public class GeneratedNewUrlBuilder_setsProtocolAndPathCorrectly {

    @Test
    public void newUrlBuilder_setsProtocolAndPathCorrectly() {
        URL u = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("https", u.getProtocol());
        assertEquals("/", u.getPath());
    }

}