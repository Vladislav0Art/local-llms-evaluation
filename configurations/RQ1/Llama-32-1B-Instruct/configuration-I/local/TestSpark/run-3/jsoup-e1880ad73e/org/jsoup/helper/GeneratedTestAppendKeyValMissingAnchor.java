package org.jsoup.helper;

public class GeneratedTestAppendKeyValMissingAnchor {

    @Test
    public void testAppendKeyValMissingAnchor() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value");
        url.appendKeyVal(new KeyVal.Builder().key("anchor").value("anchor").build());
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path?query%2Dev";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

}