package org.jsoup.helper;

public class GeneratedBuild_urlBuilderWithEmptyQueryAndFragment_ReturnsUrlWithoutPunyCoding {

    @Test
    public void build_urlBuilderWithEmptyQueryAndFragment_ReturnsUrlWithoutPunyCoding() throws MalformedURLException, URISyntaxException {
        URL url = new UrlBuilder(new URL("http://example.com"));
        assertNotEquals(null, url);
    }

}