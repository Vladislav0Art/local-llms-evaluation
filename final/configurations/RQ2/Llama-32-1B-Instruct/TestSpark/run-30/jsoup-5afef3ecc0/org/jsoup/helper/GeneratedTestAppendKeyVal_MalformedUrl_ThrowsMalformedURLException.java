package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedUrl_ThrowsMalformedURLException {

    private UrlBuilder underTest;

    @Before
    void setup() {
        // no-op
    }

    @Test
    public void testAppendKeyVal_MalformedUrl_ThrowsMalformedURLException() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        Connection.KeyVal kv1 = null;
        underTest.appendKeyVal(kv1);
        try {
            assertEquals("Invalid URL", underTest.build().toString());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}