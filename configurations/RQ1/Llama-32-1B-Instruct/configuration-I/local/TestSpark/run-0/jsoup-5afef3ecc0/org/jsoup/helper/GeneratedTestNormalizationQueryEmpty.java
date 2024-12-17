package org.jsoup.helper;

public class GeneratedTestNormalizationQueryEmpty {

    private UrlBuilder urlBuilder;

    @Test
    public void testNormalizationQueryEmpty() {
        URL url = new URL("https://example.com/path?a=b#c=d");
        assertEquals("https://example.com/path?b=c&d#", url.getScheme() + "://" + url.getHost() + "?b=c&d#");
    }

}