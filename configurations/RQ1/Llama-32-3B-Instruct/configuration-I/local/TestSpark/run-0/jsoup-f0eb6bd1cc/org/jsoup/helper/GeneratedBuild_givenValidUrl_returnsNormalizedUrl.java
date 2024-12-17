package org.jsoup.helper;

public class GeneratedBuild_givenValidUrl_returnsNormalizedUrl {

    @Test
    public void build_givenValidUrl_returnsNormalizedUrl() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL url = new URL("http://example.com/path?query=abc&def=ghi");
        UrlBuilder builder = new UrlBuilder(url);
        URL normalizedUrl = builder.build();
        assertEquals("http://example.com/path?q=abc%26def=ghi", normalizedUrl.toString());
    }

}