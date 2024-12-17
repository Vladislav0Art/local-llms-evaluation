package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedURLException_SetsError {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("https://example.com/path?a=1&b=2#anchor"));
    }

    @Test
    public void testAppendKeyVal_MalformedURLException_SetsError() {
        assert throwables().contains(UrlBuilder.MalformedURLException.class);
        // Verify we pass the original error message to Validate
        assert Validate.assertFail("MalformedURLException at urlBuilder.appendKeyVal(Connection.KeyVal kv)");
    }

}