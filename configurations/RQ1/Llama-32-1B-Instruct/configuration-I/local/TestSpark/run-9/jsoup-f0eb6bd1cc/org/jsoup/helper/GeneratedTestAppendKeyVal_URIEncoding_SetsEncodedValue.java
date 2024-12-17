package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_URIEncoding_SetsEncodedValue {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("https://example.com/path?a=1&b=2#anchor"));
    }

    @Test
    public void testAppendKeyVal_URIEncoding_SetsEncodedValue() throws UnsupportedEncodingException {
        assert throwables().contains(UnsupportedEncodingException.class);
        // Verify we pass the original error message to Validate
        assert Validate.assertFail("UnsupportedEncodingException at urlBuilder.appendKeyVal(Connection.KeyVal kv)");
    }

}