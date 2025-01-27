package org.jsoup.helper;

public class GeneratedTestUrlBuilderEmptyBaseURL {

    private String baseUrl;

    public UrlBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void appendKeyVal(String key, String value) {
        if (baseUrl.isEmpty()) {
            baseUrl += key + "=" + value;
        } else {
            if (!baseUrl.endsWith("&")) {
                baseUrl += "&";
            }
            baseUrl += key + "=" + value;
        }
    }

    public String build() {
        return baseUrl;
    }
}

public class TestUrlBuilder {

    @Test
    public void testUrlBuilderEmptyBaseURL() {
        UrlBuilder urlBuilder = new UrlBuilder("");
        urlBuilder.appendKeyVal("key1", "value1");

        String result = urlBuilder.build();

        // Test expected URL
        assertEquals("key1=value1", result);
    }

}