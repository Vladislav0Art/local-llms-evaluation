package org.jsoup.helper;

public class GeneratedBuild_url_WithQueryFragment_andEncodedPath_isCorrectlyNormalized {

    @Test
    public void build_url_WithQueryFragment_andEncodedPath_isCorrectlyNormalized() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/path?query=abc#fragment&amp;encoded%3Dpath");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String normalizedUrl = builder.build().toString();
        assertNormalizedUrl(normalizedUrl, "http://example.com/path?query=abc#fragment%26encoded%3Dpath");
    }

}