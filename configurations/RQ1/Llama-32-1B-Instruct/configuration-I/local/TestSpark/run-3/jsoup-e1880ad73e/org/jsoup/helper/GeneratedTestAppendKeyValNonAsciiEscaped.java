package org.jsoup.helper;

public class GeneratedTestAppendKeyValNonAsciiEscaped {

    @Test
    public void testAppendKeyValNonAsciiEscaped() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value!anchor");
        appendToAscii(url, false, "");
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path?query%2Fvalue%21anchor";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

}