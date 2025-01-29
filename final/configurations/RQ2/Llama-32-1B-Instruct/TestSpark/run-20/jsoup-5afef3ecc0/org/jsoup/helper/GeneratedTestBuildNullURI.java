package org.jsoup.helper;

public class GeneratedTestBuildNullURI {

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
    public void testBuildNullURI() throws UnsupportedEncodingException {
        // Test 1: build() should throw an exception if null URI
        try {
            URLBuilder urlBuilder = new org.jsoup.helper.UrlBuilder("https://example.com");
            urlBuilder.build();
        } catch (UnsupportedEncodingException e) {
            assertTrue(e.getMessage().contains("unsupported encoding"));
        }
    }

}