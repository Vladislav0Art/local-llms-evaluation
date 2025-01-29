package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testBuild_Url() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com/path?query=param";
        URL expectedUrl = new URI("http://example.com/path?query=param").toString();
        urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_KeyValues() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", inputKey);
            put("key2", inputValue);
        }});
        String expectedUrl = "http://example.com/path?key1=value1&key2=value2";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_NoValues() throws UnsupportedEncodingException {
        String inputKey = "key1";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", inputKey);
        }});
        String expectedUrl = "http://example.com/path?key1";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_EmptyMap() throws UnsupportedEncodingException {
        String inputKey = "key1";
        String inputValue = "value2";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            putAll(Map.of("key1", inputKey, "key2", inputValue));
        }});
        String expectedUrl = "http://example.com/path?key1=value2";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_NullInput() {
        try {
            urlBuilder.appendKeyVal(null);
        } catch (NullPointerException e) {
            // TO DO: verify error handling for null input
        }
    }

    @Test
    public void testBuild_UnsupportedEncoding() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com/path?query=param";
        try {
            urlBuilder.build();
            fail("Expected UnauthorizedException");
        } catch (UnauthorizedException e) {
            // TO DO: verify that the exception is thrown with the correct error message
        }
    }

    @Test
    public void testAppendKeyVal_URIEncoding() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        URL encodedInput = URLEncoder.encode(inputKey, "UTF-8");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", encodedInput);
            put("key2", inputValue);
        }});
        String expectedUrl = "http://example.com/path?key1=value1&key2=value2";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_URLEncoding() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        URL encodedInput = URLEncoder.encode(inputValue, "UTF-8");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", inputKey);
            putAll(Map.of("key2", encodedInput));
        }});
        String expectedUrl = "http://example.com/path?key1=value1&key2%20value2";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_MalformedURLEncoded() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        URL encodedInput = URLEncoder.encode(inputValue, "UTF-8");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", inputKey);
            putAll(Map.of("key2", encodedInput));
        }});
        try {
            String expectedUrl = "http://example.com/path?key1=value1";
            assertEquals(expectedUrl, urlBuilder.build().toString());
        } catch (UnsupportedEncodingException e) {
            // TO DO: verify error handling for malformed URL encoding
        }
    }

    @Test
    public void testAppendKeyVal_MalformedURI() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            putAll(Map.of("key1", inputKey, "key2", inputValue));
        }});
        try {
            String expectedUrl = "http://example.com/path?key1%20value1";
            assertEquals(expectedUrl, urlBuilder.build().toString());
        } catch (UnsupportedEncodingException e) {
            // TO DO: verify error handling for malformed URI
        }
    }

}