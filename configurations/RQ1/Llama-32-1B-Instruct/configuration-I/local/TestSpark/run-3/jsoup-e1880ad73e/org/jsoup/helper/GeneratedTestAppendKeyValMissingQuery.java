package org.jsoup.helper;

public class GeneratedTestAppendKeyValMissingQuery {

    @Test
    public void testAppendKeyValMissingQuery() {
        UrlBuilder url = new UrlBuilder("https://example.com/path");
        url.appendKeyVal(new KeyVal.Builder().key("param").value("val").build());
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

}