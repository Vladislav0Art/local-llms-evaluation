package org.jsoup.helper;

public class GeneratedTest {

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
    public void testBuild() {
        String result = new org.jsoup.helper.UrlBuilder("http://example.com").build();
        assertNotNull(result);
        assertEquals("http://example.com", result);
    }
}

public class UrlBuilderTest2 {
    public static void main(String[] args) {
        URL inputUrl = new URI("https://example.com/path?key=value");

        // Test 1: appendKeyVal() should set a key-value pair on the URL
        String result = urlBuilder.appendKeyVal(inputUrl, "newKey", "newValue");

        assertEquals("https://example.com/newKey=newValue", result);

        // Test 2: appendKeyVal(URI) should throw an exception if not supported
        try {
            urlBuilder.appendKeyVal(new org.jsoup.helper\UrlBuilder.URL("invalid"), "key", "value");
        } catch (UnsupportedEncodingException e) {
            assertTrue(e.getMessage().contains("unsupported encoding"));
        }
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

    @Test
    public void testBuild() throws UnsupportedEncodingException {
        // Test 1: build() should throw an exception if not supported
        try {
            URLBuilder urlBuilder = new org.jsoup.helper.UrlBuilder(inputUrl);
            urlBuilder.build();
        } catch (UnsupportedEncodingException e) {
            assertTrue(e.getMessage().contains("unsupported encoding"));
        }
    }

    @Test
    public void testBuildNullInput() throws UnsupportedEncodingException {
        // Test 1: build() should throw an exception if null input
        try {
            URLBuilder urlBuilder = new org.jsoup.helper.UrlBuilder(null);
            urlBuilder.build();
        } catch (UnsupportedEncodingException e) {
            assertTrue(e.getMessage().contains("unsupported encoding"));
        }
    }

    @Test
    public void testBuildEmptyUrl() throws UnsupportedEncodingException {
        // Test 1: build() should throw an exception if empty URL
        try {
            URLBuilder urlBuilder = new org.jsoup.helper.UrlBuilder("");
            urlBuilder.build();
        } catch (UnsupportedEncodingException e) {
            assertTrue(e.getMessage().contains("unsupported encoding"));
        }
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