package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedKey_ThrowsUnsupportedEncodingException {

    private UrlBuilder underTest;

    @Before
    void setup() {
        // no-op
    }

    @Test
    public void testAppendKeyVal_MalformedKey_ThrowsUnsupportedEncodingException() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal();
        kv1.setFieldId(null);
        underTest.appendKeyVal(kv1);
        try {
            assertEquals("Invalid key", underTest.build().toString());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}