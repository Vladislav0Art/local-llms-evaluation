package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedKeyValue_ThrowsUnsupportedEncodingException {

    private UrlBuilder underTest;

    @Before
    void setup() {
        // no-op
    }

    @Test
    public void testAppendKeyVal_MalformedKeyValue_ThrowsUnsupportedEncodingException() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal();
        kv1.setFieldId(null);
        try {
            underTest.appendKeyVal(kv1);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}