package org.jsoup.helper;

public class GeneratedTestAppendUrlWithFragment {

    private static final String NORMALIZED_URL = "https://example.com/path/to/resource?param1=value1&param2=value2#anchor";

    @Test
    public void testAppendUrlWithFragment() {
        URLBuilder urlBuilder = new UrlBuilder(new URL(NORMALIZED_URL + "#anchor"));
        assert urlBuilder.u.getRef().equals("#anchor");
    }

}