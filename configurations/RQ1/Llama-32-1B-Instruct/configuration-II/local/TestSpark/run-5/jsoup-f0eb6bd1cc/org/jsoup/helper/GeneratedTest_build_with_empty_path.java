package org.jsoup.helper;

public class GeneratedTest_build_with_empty_path {

    private static final String BASE_URL = "https://example.com/path?a=1&b=2#fragment";

    @Test
    public void test_build_with_empty_path() throws MalformedURLException, URISyntaxException {
        URL baseUrl = null;
        try {
            UrlBuilder urlBuilder = new UrlBuilder(baseUrl);
            urlBuilder.build();
            assert false;
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}