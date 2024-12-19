package org.jsoup.helper;

public class GeneratedTest_build_with_empty_key_value {

    private static final String BASE_URL = "https://example.com/path?a=1&b=2#fragment";

    @Test
    public void test_build_with_empty_key_value() throws MalformedURLException, URISyntaxException {
        URL baseUrl = null;
        try {
            UrlBuilder urlBuilder = new UrlBuilder(baseUrl);
            urlBuilder.appendKeyVal(new KeyVal());
            urlBuilder.build();
            assert false;
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}