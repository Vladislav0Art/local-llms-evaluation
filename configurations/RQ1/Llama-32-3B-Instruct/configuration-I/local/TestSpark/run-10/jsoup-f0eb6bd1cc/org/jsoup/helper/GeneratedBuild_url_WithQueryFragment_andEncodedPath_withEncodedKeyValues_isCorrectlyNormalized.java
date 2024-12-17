package org.jsoup.helper;

public class GeneratedBuild_url_WithQueryFragment_andEncodedPath_withEncodedKeyValues_isCorrectlyNormalized {

    @Test
    public void build_url_WithQueryFragment_andEncodedPath_withEncodedKeyValues_isCorrectlyNormalized() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/path?query=abc&encoded%3Dkey1%26value1#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String normalizedUrl = builder.build().toString();
        assertNormalizedUrl(normalizedUrl, "http://example.com/path?query=abc&encoded=%26key1%26value1#fragment");
    }

}