package org.jsoup.helper;

public class GeneratedBuild_url_WithQueryFragment_isCorrectlyNormalized {

    @Test
    public void build_url_WithQueryFragment_isCorrectlyNormalized() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/path?query=abc#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String normalizedUrl = builder.build().toString();
        assertNormalizedUrl(normalizedUrl, "http://example.com/path?query=abc#fragment");
    }

}