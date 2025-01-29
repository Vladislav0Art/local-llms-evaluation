package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

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
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String inputUrl = new URI("https://example.com/path?key=value");
        URLBuilder urlBuilder = new org.jsoup.helper.UrlBuilder(inputUrl);

        // Test 1: appendKeyVal(URI) should throw an exception if not supported
        try {
            urlBuilder.appendKeyVal(new org.jsoup.helper\UrlBuilder.URL("invalid"), "key", "value");
        } catch (UnsupportedEncodingException e) {
            assertTrue(e.getMessage().contains("unsupported encoding"));
        }

        // Test 2: appendKeyVal(URI, "key", "value") should set a key-value pair on the URL builder
        urlBuilder.appendKeyVal(inputUrl, "newKey", "newValue");
    }

}