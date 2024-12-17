package org.jsoup.helper;

public class GeneratedTestBuildNoQueryEncoded {

    @Test
    public void testBuildNoQueryEncoded() {
        URLBuilder url = new UrlBuilder("https://example.com/path");
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

}