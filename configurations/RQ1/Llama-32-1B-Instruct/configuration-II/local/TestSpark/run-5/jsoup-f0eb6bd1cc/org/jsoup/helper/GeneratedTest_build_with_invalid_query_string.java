package org.jsoup.helper;

public class GeneratedTest_build_with_invalid_query_string {

    private static final String BASE_URL = "https://example.com/path?a=1&b=2#fragment";

    @Test
    public void test_build_with_invalid_query_string() throws MalformedURLException, URISyntaxException {
        URL baseUrl = null;
        try {
            UrlBuilder urlBuilder = new UrlBuilder(baseUrl);
            urlBuilder.appendKeyVal(new KeyVal("c", "3"));
            urlBuilder.build();
            assert false;
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}