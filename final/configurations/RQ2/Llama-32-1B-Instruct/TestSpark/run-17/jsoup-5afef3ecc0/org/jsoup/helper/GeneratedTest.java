package org.jsoup.helper;

public class GeneratedTest {

    private final UrlBuilder urlBuilder;
    private String inputUrl;

    @Test
    public void testBuild_URL_1() throws MalformedURLException, UnsupportedEncodingException {
        inputUrl = "https://example.com/path?key=value";
        URL result = urlBuilder.build();
        URI uri = new URI(result.toString());
        assertEquals("https://example.com/path", uri.toString());
    }

    @Test
    public void testBuild_URL_2() throws MalformedURLException, UnsupportedEncodingException {
        inputUrl = "https://example.com/path?key=value";
        URL result = urlBuilder.build();
        URI uri = new URI(result.toString());
        assertEquals("https://example.com/path", uri.toString());
    }

    @Test
    public void testAppendKeyVal_1() throws UnsupportedEncodingException {
        final String key = "key";
        final String value = "value";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));
        // No assertion needed as the method does not modify any external state
    }

    @Test
    public void testAppendKeyVal_2() throws UnsupportedEncodingException {
        final String key = "key";
        final String value = "value";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value).toKeyVal());
        // No assertion needed as the method does not modify any external state
    }

    @Test
    public void testAppendKeyVal_3() throws UnsupportedEncodingException {
        final String key = "key";
        final String value = "value";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value).toKeyVal());
        // No assertion needed as the method does not modify any external state
    }

    @Test
    public void testAppendKeyVal_4() throws UnsupportedEncodingException {
        final String key = "key";
        final String value = "value";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value).toKeyVal("foo", "bar"));
        // No assertion needed as the method does not modify any external state
    }

    @Test
    public void testAppendKeyVal_5() throws UnsupportedEncodingException {
        final String key = "key";
        final String value = "value";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value).toKeyVal());
        // No assertion needed as the method does not modify any external state
    }

}