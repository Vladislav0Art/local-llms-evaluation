package org.jsoup.helper;

public class GeneratedTestAppendKeyValMissingFragment {

    @Test
    public void testAppendKeyValMissingFragment() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value");
        url.appendKeyVal(new KeyVal.Builder().key("param").value("val").build());
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path%3Bquery%2Dev";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

}