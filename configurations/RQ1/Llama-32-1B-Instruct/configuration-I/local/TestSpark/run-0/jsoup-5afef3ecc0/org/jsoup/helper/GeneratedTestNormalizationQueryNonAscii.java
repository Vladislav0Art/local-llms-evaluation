package org.jsoup.helper;

public class GeneratedTestNormalizationQueryNonAscii {

    private UrlBuilder urlBuilder;

    @Test
    public void testNormalizationQueryNonAscii() throws UnsupportedEncodingException {
        String query = "a=1&b=2";
        URL url = new URL("https://example.com/path", query);
        assertEquals("https://example.com/path?b%3D2&a=1&%26", url.getScheme() + "://" + url.getHost() + "?" + query);
    }

}