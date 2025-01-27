package org.jsoup.helper;

public class GeneratedBuildWithQueryParams {

    private UrlBuilder urlBuilder;

    @Test
    public void buildWithQueryParams() throws UnsupportedEncodingException, URLEncoder.encode {
        String encodedValue = "value with spaces";
        URL url = new URL("http://example.com/path?param=" + encodedValue);
        assertNotSame(url, urlBuilder.build());
    }

}