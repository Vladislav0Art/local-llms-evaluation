package org.jsoup.helper;

public class GeneratedTestAppendKeyValEscapedQuery {

    @Test
    public void testAppendKeyValEscapedQuery() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value#anchor");
        appendToAscii(url, true, "");
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path%3Fquery%2Dev%23anchor";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

}