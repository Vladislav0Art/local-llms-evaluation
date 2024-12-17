package org.jsoup.helper;

public class GeneratedTestNormalizationRefNonAscii {

    private UrlBuilder urlBuilder;

    @Test
    public void testNormalizationRefNonAscii() throws UnsupportedEncodingException {
        String ref = "reference";
        URL url = new URL("https://example.com/path", ref, null, 8080);
        assertEquals("https://reference%3B20", url.getScheme() + "://" + url.getHost());
    }

}