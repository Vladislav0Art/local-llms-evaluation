package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public String getAppendKeyDecodedString(String query) {
        return this.url + "?key=" + URLEncoder.encode(query, DataUtil.UTF_8);
    }

    public String getAppendKeyEncodedString(String query) {
        return this.url + "?key=" + URLEncoder.encode(query, DataUtil.UTF_8);
    }
}

public class TestUrlBuilder {

    @Test
    public void testUrlBuilder() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");

        // Test with query parameters
        assertEquals("http://example.com", urlBuilder.getAppendKeyDecodedString("key=value&anotherParam=anotherValue").toString());

        // Test with URL encoding
        String reEncodedQuery = "key=value&anotherParam=another%20Value";
        assertEquals("http://example.com?key=" + URLEncoder.encode(reEncodedQuery, DataUtil.UTF_8), urlBuilder.getAppendKeyEncodedString(reEncodedQuery).toString());
    }
}

}