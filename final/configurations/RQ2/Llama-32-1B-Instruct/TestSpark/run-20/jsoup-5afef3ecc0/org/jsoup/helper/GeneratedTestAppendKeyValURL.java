package org.jsoup.helper;

public class GeneratedTestAppendKeyValURL {

    public static void main(String[] args) {
        UrlBuilder urlBuilder = new org.jsoup.helper.UrlBuilder("http://example.com");

        // Test 1: build() should return an instance of Url
        String result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://example.com", result);

        // Test 2: appendKeyVal(URI, "key", "value") should set a key-value pair on the URL builder
        String inputUrl = new URI("https://example.com/path?key=value");
        urlBuilder.appendKeyVal(inputUrl, "newKey", "newValue");

        assertEquals("https://example.com/newKey=newValue", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyValURL() throws UnsupportedEncodingException {
        String inputUrl = new org.jsoup.helper.UrlBuilder("https://example.com/path?key=value").build().toString();

        // Test 1: appendKeyVal(URI) should throw an exception if not supported
        try {
            urlBuilder.appendKeyVal(new org.jsoup.helper\UrlBuilder.URL(inputUrl), "key", "value");
        } catch (UnsupportedEncodingException e) {
            assertTrue(e.getMessage().contains("unsupported encoding"));
        }

        // Test 2: appendKeyVal(URI, "key", "value") should set a key-value pair on the URL builder
        urlBuilder.appendKeyVal(inputUrl, "newKey", "newValue");
    }
}

public class UrlBuilderTest3 {
    public static void main(String[] args) {
        String inputUrl = new URI("https://example.com/path?key=value");

        // Test 1: build() should throw an exception if not supported
        try {
            URLBuilder urlBuilder = new org.jsoup.helper.UrlBuilder(inputUrl);
            urlBuilder.build();
        } catch (UnsupportedEncodingException e) {
            assertTrue(e.getMessage().contains("unsupported encoding"));
        }
    }

}