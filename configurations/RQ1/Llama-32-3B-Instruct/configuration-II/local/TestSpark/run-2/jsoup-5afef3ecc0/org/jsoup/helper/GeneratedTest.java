package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void newUrlBuilderFromNormalUrlCreatesNewUrl() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(new URL("http://example.com/path?a%3D1%26b%3D2%23ref"), urlBuilder.build());
    }

    @Test
    public void newUrlBuilderFromInvalidUrlAsserts() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("invalid_url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assert Validate.assertFail("MalformedURLException: 'invalid_url' is not a valid URL");
    }

    @Test
    public void appendKeyValToNormalUrlEncodesKeysAndValuesCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal[] keyVals = {new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        for (Connection.KeyVal kv : keyVals) {
            urlBuilder.appendKeyVal(kv);
        }
        assertEquals(new URL("http://example.com/path?key1%3Dvalue1&key2%3Dvalue2"), urlBuilder.build());
    }

    @Test
    public void appendKeyValToInvalidUrlDoesNotModifyUrl() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal[] keyVals = {new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        URL inputUrl = new URL("invalid_url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        for (Connection.KeyVal kv : keyVals) {
            urlBuilder.appendKeyVal(kv);
        }
        assertEquals(new URL("invalid_url"), urlBuilder.build());
    }

    @Test
    public void decodePartHandlesNullInputCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        String encoded = "http://example.com/path";
        assertEquals("http://example.com/path", UrlBuilder.decodePart(encoded));
    }

    @Test
    public void normalizeQueryReplacesSpacesWithPlusSigns() {
        assertEquals("+a%3D1%26b%3D2", UrlBuilder.normalizeQuery(" a=1&b=2 "));
    }

    @Test
    public void normalizeRefReplacesSpacesWithPercent20Characters() {
        assertEquals("%20ref", UrlBuilder.normalizeRef("  ref "));
    }

}