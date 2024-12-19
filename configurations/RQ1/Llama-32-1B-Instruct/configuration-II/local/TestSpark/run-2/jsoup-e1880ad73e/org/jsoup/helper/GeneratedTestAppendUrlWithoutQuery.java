package org.jsoup.helper;

public class GeneratedTestAppendUrlWithoutQuery {

    private static final String NORMALIZED_URL = "https://example.com/path/to/resource?param1=value1&param2=value2#anchor";

    @Test
    public void testAppendUrlWithoutQuery() {
        URLBuilder urlBuilder = new UrlBuilder(new URL(NORMALIZED_URL));
        assert urlBuilder.u.getRef().isEmpty();
    }

}