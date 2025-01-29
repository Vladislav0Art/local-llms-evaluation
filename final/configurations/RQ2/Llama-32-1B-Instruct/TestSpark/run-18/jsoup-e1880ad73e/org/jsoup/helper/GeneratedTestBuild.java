package org.jsoup.helper;

public class GeneratedTestBuild {

    private static final String INPUT_URL = "https://example.com";

    @Test
    public void testBuild() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(INPUT_URL);
        URL result = urlBuilder.build();
        assertNotNull(result, "Expected URL to be null");
    }

}