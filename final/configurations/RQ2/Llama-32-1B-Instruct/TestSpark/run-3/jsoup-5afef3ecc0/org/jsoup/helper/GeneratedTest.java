package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testBuild_url() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(new URI(url));
        URL actualUrl = builder.build();
        assertEquals("https://example.com", actualUrl.toString());
    }

    @Test
    public void testAppendKeyVal_key_value() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(null);
        String key = "key";
        String value = "value";
        builder.appendKeyVal(new Connection.KeyVal(key, value));
        assertEquals("key=value", StringUtil.stripMargin(builder.build().toString()));
    }

    @Test
    public void testAppendKeyVal_invalid_key() {
        try {
            UrlBuilder.builder();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyVal_empty_key() {
        String key = "";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new Connection.KeyVal(key, value));
        try {
            builder.appendKeyVal(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyVal_empty_value() {
        String key = "key";
        String emptyValue = "";
        UrlBuilder builder = new UrlBuilder(new Connection.KeyVal(key, emptyValue));
        try {
            builder.appendKeyVal(emptyValue);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyVal_no_key_value() throws UnsupportedEncodingException {
        String key = "key";
        UrlBuilder builder = new UrlBuilder(new URI(url));
        builder.appendKeyVal(null);
        assertEquals("", StringUtil.stripMargin(builder.build().toString()));
    }

    @Test
    public void testUrlDecoder_encode_url() throws UnsupportedEncodingException {
        URL url = new URI("https://example.com");
        String encodedUrl = UrlBuilder.encodeURL(url);
        assertEquals("https%3A//example.com", encodedUrl.toString());
    }

    @Test
    public void testUrlEncoder_decode_url() throws UnsupportedEncodingException {
        String encodedUrl = "https%3A//example.com";
        URL url = UrlBuilder.decodeURL(encodedUrl);
        assertEquals(new URI("https://example.com"), url);
    }

}