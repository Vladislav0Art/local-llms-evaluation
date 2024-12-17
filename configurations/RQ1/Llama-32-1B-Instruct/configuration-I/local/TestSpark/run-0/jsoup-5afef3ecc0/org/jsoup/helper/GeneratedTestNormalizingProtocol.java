package org.jsoup.helper;

public class GeneratedTestNormalizingProtocol {

    private UrlBuilder urlBuilder;

    @Test
    public void testNormalizingProtocol() {
        String protocol = "http://example.com";
        URL url = new URL(protocol);
        assertEquals("http:", url.getScheme());
    }

}