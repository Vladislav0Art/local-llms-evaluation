package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder underTest;

    @Before
    void setup() {
        // no-op
    }

    @Test
    public void testAppendKeyVal_WhenEmptyInput_ReturnsUrl() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal();
        Connection.KeyVal kv2 = new Connection.KeyVal();
        underTest.appendKeyVal(kv1);
        underTest.appendKeyVal(kv2);
        assertEquals("http://example.com", underTest.build().toString());
    }

    @Test
    public void testAppendKeyVal_WhenEmptyInputAndNoKeyVal_ReturnsUrl() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = new Connection.KeyVal();
        underTest.appendKeyVal(kv1);
        underTest.appendKeyVal(kv2);
        assertEquals("http://example.com", underTest.build().toString());
    }

    @Test
    public void testAppendKeyVal_WhenEmptyInputAndNoKeyValuePairs_ReturnsUrl() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        underTest.appendKeyVal(null);
        assertEquals("http://example.com", underTest.build().toString());
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

    @Test
    public void testAppendKeyVal_MalformedUrl_ThrowsMalformedURLException() {
        URLBuilder builder = new UrlBuilder(new URI("invalid-url"));
        Connection.KeyVal kv1 = null;
        underTest.appendKeyVal(kv1);
        try {
            assertEquals("Invalid URL", underTest.build().toString());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
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

    @Test
    public void testAppendKeyVal_MalformedKey_ThrowsUnsupportedEncodingException() {
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

    @Test
    public void testAppendKeyVal_MalformedKey_ThrowsUnsupportedEncodingException() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com"));
        Connection.KeyVal kv1 = null;
        underTest.appendKeyVal(kv1);
        try {
            assertEquals("Invalid key", underTest.build().toString());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
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